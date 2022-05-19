package k.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class D_Callable {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			Callable<Integer> task = (() -> 30 + 11);
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(task);
			System.out.println(result.get(1, TimeUnit.SECONDS)); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
