package k.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class H_ThreadPool {
//A thread pool is a group of pre‐instantiated reusable threads that are available to perform a set of arbitrary tasks
	public static void main(String[] args) {
		ExecutorService service = null; 
		ScheduledExecutorService service2 = null;
		try {
			service = Executors.newCachedThreadPool();
			service.execute(Z_UTIL.runnableTask1);
			service.submit(Z_UTIL.callableTask1);
			System.out.println("<-------------->1 " + Thread.activeCount());
		} finally {
			Z_UTIL.threadShutdown(service, 1);
		}
		
		try {
			service = Executors.newFixedThreadPool(2);
			service.execute(Z_UTIL.runnableTask1);
			service.submit(Z_UTIL.callableTask1);
			System.out.println("<-------------->2  " + Thread.activeCount());
		} finally {
			Z_UTIL.threadShutdown(service, 2);
		}
		
		try {
			service2 = Executors.newScheduledThreadPool(2);
			service2.execute(Z_UTIL.runnableTask1);
			service2.submit(Z_UTIL.callableTask1);
			System.out.println("<-------------->3  " + Thread.activeCount());
		} finally {
			Z_UTIL.threadShutdown(service2, 3);
		}
		
		System.out.println("<-------------->end  " + Thread.activeCount());
	}
}
