package k.concurrency;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Test {
	private int sheepCount = 0;
	   private void incrementAndReport() {
	      System.out.print((sheepCount++)+" ");
	   }
	   public static void main(String[] args) {
	      ExecutorService service = null;
	      try {
	         service = Executors.newFixedThreadPool(20);
	         Test manager = new Test();
	         for(int i = 0; i < 10; i++)
	            service.submit(() -> manager.incrementAndReport());
	      } finally {
	         if(service != null) service.shutdown();
	      }
	   }
	
}
