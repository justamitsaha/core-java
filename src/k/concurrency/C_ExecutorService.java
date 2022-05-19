package k.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//The Concurrency API uses ExecutorService interface, which defines services that create and manage threads.
public class C_ExecutorService {
	private static int counter = 0;

	public static void main(String[] args) {
		Runnable task1 = (() -> System.out.println("Printing zoo inventory"));
		Runnable task2 = () -> {
			for (int i = 0; i <= 500000; i++)
				if (i == 500000)
					System.out.println("Printing record: " + i);
		};
		ExecutorService service = null;

		// Create Thread using execute method no return type
		try {
			// Executors factory class helps to create instances of the ExecutorService object which can be used to create new thread using execute method
			service = Executors.newSingleThreadExecutor();
			service.execute(task1);
			service.execute(task2);
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
		// All the above will be created using single new thread other than main
		System.out.println("<--------------> " + Thread.activeCount());

		try {
			Runnable task3 = () -> {
				for (int i = 0; i < 5000; i++) {
					C_ExecutorService.counter++;
				}
				System.out.println(C_ExecutorService.counter++);
			};
			// submit() returns a Future instance that can be used to determine whether the task is complete
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(task3);
			result.get(1, TimeUnit.SECONDS);
			//If we make above timer as zero we will get java.util.concurrent.TimeoutException
			System.out.println("Reached! " +C_ExecutorService.counter);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
		System.out.println("<--------------> " + Thread.activeCount());
	}
}
