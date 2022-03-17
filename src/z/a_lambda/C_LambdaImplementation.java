package z.a_lambda;

public class C_LambdaImplementation {

	public static void main(String[] args) {
		int num = 5;
		// implementation 1
		Checkeven ch = a -> (a % 2 == 1) ? true : false;
		ch.checkEven(num);

		// implementation 2
		checkEven(num, a -> (a % 2 == 1) ? true : false);

	}

	static void checkEven(int i, Checkeven ch) {
		ch.checkEven(i);
	}
}

interface Checkeven {
	boolean checkEven(int i);
}
