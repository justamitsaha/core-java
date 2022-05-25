package k.concurrency;

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
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(Z_UTIL.callableTask1);
			System.out.println(result.get(1, TimeUnit.SECONDS)); 
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}finally {
			Z_UTIL.threadShutdown(service, 1);
		}
	}

}
