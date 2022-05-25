package k.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class J_Synchronize {

	private int sheepCount = 0;

	private void incrementAndReport() {
		//Although all threads are still created and executed at the same time, they each wait at the synchronized block for the worker to increment and report the result before entering. 
		synchronized (this) {
			System.out.print((++sheepCount) + " ");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			var manager = new J_Synchronize();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
