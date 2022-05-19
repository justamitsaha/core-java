package k.concurrency;

public class B_Polling {
	private static int counter = 0;
	private static final int desiredValue = 500000;

	//one thread often needs to wait for the results of another thread to proceed. One solution is to use polling. Polling is the process of intermittently checking data at some fixed interval
	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			for (int i = 0; i < desiredValue; i++)
				B_Polling.counter++;
			System.out.println(B_Polling.counter);
		}).start();
		while (B_Polling.counter < desiredValue) {
			System.out.println("Not reached yet");
			Thread.sleep(1000);  // This allows some buffer time for below statement to run after the loop in thread is complete otherwise it may print value before all increment is done
		}
		System.out.println("Reached!" +B_Polling.counter);
	}
}