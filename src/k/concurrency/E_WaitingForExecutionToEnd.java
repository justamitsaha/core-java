package k.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class E_WaitingForExecutionToEnd {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		Future<Integer> result;
		try {
			Callable<Integer> task = (() -> 30 + 11);
			service = Executors.newSingleThreadExecutor();
			result = service.submit(task);
		} finally {
			if (service != null)
				service.shutdown();
		}
		if (service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);

			// Check whether all tasks are finished
			if (service.isTerminated()) {
				System.out.println("Finished!" +result.get());
				
			} else
				System.out.println("At least one task is still running");
		}

	}

}
