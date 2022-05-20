package k.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class G_SchedulingTask {

	public static void main(String[] args) {
		Runnable task = (() -> {
			System.out.println("This is a runnable task");
		});
		Callable<String> task2 = (() -> {
			System.out.println("This is callable task");
			return "This is callable task";
		});

		// ScheduledExecutorService creates a new thread in the mentioned duration
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.schedule(task, 1, TimeUnit.MINUTES);
		ScheduledFuture<String> s = service.schedule(task2, 2, TimeUnit.SECONDS);
		System.out.println("<--------------> " + Thread.activeCount());
		try {
			// The duration of the get should be such that the thread is execution is
			// complete otherwise it will throw exception
			System.out.println(s.get(10, TimeUnit.SECONDS));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}

		Runnable task3 = (() -> {
			System.out.println("This is a runnable task3");
		});
		service.scheduleAtFixedRate(task, 5, 1, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(task3, 0, 2, TimeUnit.SECONDS);
		System.out.println("<--------------> " + Thread.activeCount());
	}
}
