package z.c_functionalInterface;

import java.util.function.BiFunction;

public class H_BiFunctionFI {

	public static void main(String[] args) {
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		 
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick
	}

}
