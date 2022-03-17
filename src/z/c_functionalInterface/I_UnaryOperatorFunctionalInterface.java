package z.c_functionalInterface;

import java.util.function.UnaryOperator;

//UnaryOperator and BinaryOperator are a special case of a Function. They require all type parameters to be the same type. A UnaryOperator transforms its value into one of the same type.
public class I_UnaryOperatorFunctionalInterface {
	public static void main(String[] args) {
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		 
		System.out.println(u1.apply("chirp"));  // CHIRP
		System.out.println(u2.apply("chirp"));  // CHIRP
	}
}
