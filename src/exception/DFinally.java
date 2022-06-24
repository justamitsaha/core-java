package exception;

public class DFinally {
// ** What is the return value of the goHome() method? In this case,its always -3. Because the finally block is executed shortly before the method completes, it interrupts the return statement from inside both the try and catch blocks.
	public static void main(String[] args) {
		System.out.println(goHome());

		//There is one exception to â€œthe finally block always be executedâ€� rule: Java defines a method that you call as System.exit(). It takes an integer parameter that represents the error code that gets returned
//		try {
//			System.out.println(1);
//			System.exit(0);
//			System.out.println(2);
//		} finally {
//			System.out.println(3); // Not printed
//		}
	}

	@SuppressWarnings("finally")
	static int goHome() {
		try {
			Exception e = new Exception();
			throw e;
			//return -1;
		} catch (Exception e) {
			return -2;
		} finally {
			return -3;
		}
	}
}

