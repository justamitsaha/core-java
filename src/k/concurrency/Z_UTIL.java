package k.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Z_UTIL {
	public static Runnable runnableTask1 = (() -> {
		for (int i = 0; i <= 50000; i++) {
			if (i == 50000)
				System.out.println("Runnable Reached 50k " + i);
		}
	});
	
	public static Runnable runnableTask2 = (() -> System.out.println("This is runnable Task"));

	public static Callable<Integer> callableTask1 = (() -> {
		int count = 0;
		for (int i = 0; i <= 50000; i++) {
			if (i % 2 == 0)
				count = count + 1;
		}
		System.out.println(count);
		return count;
	});
	
	public static Callable<Integer> callableTask2 = (() -> 5+9);
	
	public static void threadShutdown(ExecutorService service, int i) {
		if (service != null) {
			service.shutdown();
			//System.out.println(i+ " Shut down <------------> "+Thread.activeCount());
		}
	}
}
