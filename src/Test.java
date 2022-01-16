
public class Test {

	public static void main(String[] args) {
		System.out.println(goHome());
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
