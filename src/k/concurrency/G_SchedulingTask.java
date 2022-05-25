package k.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class G_SchedulingTask {

	public static void main(String[] args) {
		

		// ScheduledExecutorService creates a new thread in the mentioned duration
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.schedule(Z_UTIL.runnableTask1, 1, TimeUnit.MINUTES);
		ScheduledFuture<Integer> s = service.schedule(Z_UTIL.callableTask1, 2, TimeUnit.SECONDS);
		System.out.println("<--------------> " + Thread.activeCount());
		try {
			// The duration of the get should be such that the thread is execution is
			// complete otherwise it will throw exception
			System.out.println(s.get(10, TimeUnit.SECONDS));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}

		service.scheduleAtFixedRate(Z_UTIL.runnableTask1, 5, 1, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(Z_UTIL.runnableTask1, 0, 2, TimeUnit.SECONDS);
		System.out.println("<--------------> " + Thread.activeCount());
	}
}
