
public class B_AnotherLabda {

	public static void main(String[] args) {
		StringLengthInterface myLambda = stringvar -> stringvar.length();
		System.out.println(myLambda.getLength("Hello"));

		StringConcatLengthInterface myLambda2 = (s1, s2) -> (s1 + s2).length();
		print(myLambda2, "hello", "world");
	}

	public static void print(StringConcatLengthInterface lamda, String s1, String s2) {
		System.out.println(lamda.getLength(s1, s2));
	}

}

//@FunctionalInterface
interface StringLengthInterface {
	int getLength(String stringvar);

	// Below is not abstract so thisn interface is still Functional
	static void someNonAbstractMethod() {
		System.out.println("hi");
	}

}

@FunctionalInterface
interface StringConcatLengthInterface {
	int getLength(String stringvar1, String stringvar2);
}
