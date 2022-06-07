package k.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//CyclicBarrier used to execute a series of task sequentially in side a thread
public class M_CyclicBarrier {
	static ExecutorService service = null;

	public static void main(String[] args) {
		//conductNonConcurrentElections();
		conductElectionsWithCyclicBarriers();
	}

	public static void conductNonConcurrentElections() {
		try {
			service = Executors.newFixedThreadPool(4);
			for (int i = 0; i < 4; i++)
				service.submit(() -> conductElections());
		} finally {
			Z_UTIL.threadShutdown(service, 0);
		}
	}

	public static void conductElectionsWithCyclicBarriers() {
		var c1 = new CyclicBarrier(4);
		var c2 = new CyclicBarrier(4, () -> System.out.println("*** Voting Completed!"));
		var c3 = new CyclicBarrier(4, () -> System.out.println("*** Counting Completed!"));
		try {
			service = Executors.newFixedThreadPool(4);
			for (int i = 0; i < 4; i++)
				service.submit(() -> conductElectionsWithBarriers(c1, c2, c3));
		} finally {
			Z_UTIL.threadShutdown(service, 0);
		}
	}

	public static void conductElectionsWithBarriers(CyclicBarrier c1, CyclicBarrier c2, CyclicBarrier c3) {

		try {
			preparePoolingBooths();
			c1.await();
			startVoting();
			c2.await();
			startCounting();
			c3.await();
			declareResults();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

	public static void conductElections() {
		preparePoolingBooths();
		startVoting();
		startCounting();
		declareResults();
	}

	public static void preparePoolingBooths() {
		System.out.println("1 Preparing Polling Booths");
	}

	public static void startVoting() {
		System.out.println("2 Starting Voting");
	}

	public static void startCounting() {
		System.out.println("3 Count Ballots");
	}

	public static void declareResults() {
		System.out.println("4 Declare winner");
	}
}
