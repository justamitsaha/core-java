package k.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class L_OtherLocks {
	private int sheepCount = 0;

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			var manager = new L_OtherLocks();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport2());
		} finally {
			System.out.println(Thread.activeCount());
			Z_UTIL.threadShutdown(service, 0);
		}
	}

	private void incrementAndReport() {
		Lock lock = new ReentrantLock();
		if (lock.tryLock()) {
			try {
				System.out.println((++sheepCount) + "  <------------> " + Thread.activeCount());
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println("Unable to acquire lock, doing something else");
		}
	}

	private void incrementAndReport2() {
		Lock lock = new ReentrantLock();
		try {
			if (lock.tryLock(10,TimeUnit.SECONDS)) {
				try {
					System.out.println((++sheepCount) + "  <------------> " + Thread.activeCount());
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("Unable to acquire lock, doing something else");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
