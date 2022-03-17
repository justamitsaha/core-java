package z.c_functionalInterface;

import java.util.function.Consumer;

//You use a Consumer when you want to do something with a parameter but not return anything
public class B_ConsumerFunctionalInterface {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		c2.accept("Annie");
	}
}
