package z.c_functionalInterface;

import java.util.function.BinaryOperator;

public class J_BinaryOperatorFunctionalInterface {
	public static void main(String[] args) {
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (firstString, secondString) -> firstString.concat(secondString);
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick
		
	}
}
