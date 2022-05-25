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
		ExecutorService service = null;
		try {
			// Executors factory class helps to create instances of the ExecutorService object which can be used to create new thread using execute method
			service = Executors.newSingleThreadExecutor();
			// Create Thread using execute method it has no return type
			service.execute(Z_UTIL.runnableTask1);
			service.execute(Z_UTIL.runnableTask2);
		} finally {
			Z_UTIL.threadShutdown(service, 1);
		}
		// All the above will be created using single new thread other than main
		System.out.println("<--------------> " + Thread.activeCount());

		try {
			// submit() returns a Future instance that can be used to determine whether the task is complete, since Runnable is passed to execute nothing is returned
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(Z_UTIL.runnableTask1);
			result.get(1, TimeUnit.SECONDS);
			//If we make above timer as zero we will get java.util.concurrent.TimeoutException
			System.out.println("Reached! " +C_ExecutorService.counter);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		} finally {
			Z_UTIL.threadShutdown(service, 2);
		}
		System.out.println("<--------------> " + Thread.activeCount());
	}
}
