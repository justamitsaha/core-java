package k.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Lock interface that is conceptually similar to using the synchronized keyword
public class K_Lock {
	private int sheepCount = 0;

	private void incrementAndReport() {
		Lock lock = new ReentrantLock();
		try {
			lock.lock();
			System.out.println((++sheepCount) + "  <------------> "+Thread.activeCount());
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			var manager = new K_Lock();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			Z_UTIL.threadShutdown(service, 0);
		}
	}
}
