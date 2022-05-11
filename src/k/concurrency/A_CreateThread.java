package k.concurrency;

public class A_CreateThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println("Printing record: " + i);
		System.out.println("<------------->");
	}

	public static void main(String[] args) {
		(new Thread(new A_CreateThread())).start();
		(new ReadInventoryThread()).start();
	}
}

class ReadInventoryThread extends Thread {
	@Override
	public void run() { // Overrides method in Thread
		System.out.println("Printing zoo inventory");
		System.out.println("<------------->");
	}

	public static void main(String[] args) {
		(new ReadInventoryThread()).start();
	}
}
