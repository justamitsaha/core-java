public class Test {
// ** What is the return value of the goHome() method? In this case, it’s always -3. Because the finally block is executed shortly before the method completes, it interrupts the return statement from inside both the try and catch blocks.
	public static void main(String[] args) {
		System.out.println(goHome());

		//There is one exception to “the finally block always be executed” rule: Java defines a method that you call as System.exit(). It takes an integer parameter that represents the error code that gets returned
		try {
			System.exit(0);
		} finally {
			System.out.print("Never going to get here"); // Not printed
		}
	}

	static int goHome() {
		try {
//			Exception e = new Exception();
//			throw e;
			System.out.println("1");
			return -1;
		} catch (Exception e) {
			System.out.println("2");
			return -2;
		} finally {
			System.out.println("3");
			return -3;
		}
	}
}

