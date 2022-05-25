package k.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//remember that the invokeAll() method will wait indefinitely until all tasks are complete, while the invokeAny() method will wait indefinitely until at least one task completes
public class F_InvokeAllAny {
	public static void main(String[] args) {
		
		ExecutorService service = null;
		service = Executors.newSingleThreadExecutor();
		try {
			//the invokeAll() method will wait indefinitely until all tasks are complete
			List<Future<Integer>> lst = service.invokeAll(List.of(Z_UTIL.callableTask1, Z_UTIL.callableTask2));
			//Below line won't execute till all tasks are complete
			System.out.println(lst.get(0).get(1, TimeUnit.SECONDS));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}

		service = Executors.newSingleThreadExecutor();
		try {
			 // invokeAny() method will wait indefinitely until at least one task completes 
			Integer data = service.invokeAny(List.of(Z_UTIL.callableTask1, Z_UTIL.callableTask2));
			System.out.println(data);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
