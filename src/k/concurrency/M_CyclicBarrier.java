package k.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class M_CyclicBarrier {
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			for (int i = 0; i < 4; i++)
				service.submit(() ->conductElections());
		} finally {
			Z_UTIL.threadShutdown(service, 0);
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
