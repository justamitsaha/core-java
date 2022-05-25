package k.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class I_ThreadSafeAtomic {
	static ExecutorService service = null;
	private static int count = 0;
	private static AtomicInteger atomicCount = new AtomicInteger(0);

	private static void incrementAndReport() {
		System.out.println((count++) + " ");
	}

	public static void main(String[] args) {
		//nonAtomicincrement();
		atomicincrement();
	}

	public static void nonAtomicincrement() {
		try {
			service = Executors.newFixedThreadPool(20);
			for (int i = 0; i < 10; i++)
				service.submit(() -> incrementAndReport());
		} finally {
			Z_UTIL.threadShutdown(service, 1);
		}
	}

	public static void atomicincrement() {
		try {
			service = Executors.newFixedThreadPool(20);
			for (int i = 0; i < 10; i++)
				service.submit(() -> {
					System.out.println(atomicCount.incrementAndGet());
				});
		} finally {
			Z_UTIL.threadShutdown(service, 1);
		}
	}
}
