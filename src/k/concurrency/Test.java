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
	public static void main(String[] args) {
		Callable<Integer> task = (()-> {for(int i=0; i<50000;i++) {
		}return 5;});
		Callable<Integer> task1 = (() -> 5+9);
		
		ExecutorService service = null;
		
		service = Executors.newSingleThreadExecutor();
		try {
			List<Future<Integer>> lst = service.invokeAll(List.of(task, task1));
			
			System.out.println(lst.get(0).get(1, TimeUnit.SECONDS));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
