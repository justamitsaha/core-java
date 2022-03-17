package z.b_methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {
	public static void main(String[] args) {
		Consumer<String> cu1 = a-> System.out.println(a);
		cu1.accept("OMG Lambda");
		
		Consumer<String> cu2 =  System.out::println;
		cu2.accept("OMG what is this");
		
		//Static method implementation of method reference
		List<Integer> lst = Arrays.asList(1,10,23,9,6,8);
		Consumer<List<Integer>> cu = Collections::sort;
		cu.accept(lst);
		
		for(Integer i: lst) {
			System.out.println(i);
		}
		
		//Instance method implementation of method reference
		var str = "abc";
		Predicate<String> methodRef = str::startsWith;
		Predicate<String> lambda = s -> str.startsWith(s);
		 str.startsWith("a");
		System.out.println(methodRef.test("a"));
		System.out.println(lambda.test("a"));
		
		//It looks like a static method, but it isn't. Instead, Java knows that isEmpty() is an instance method that does not take any parameters.
		//Java uses the parameter supplied at runtime as the instance on which the method is called.
		Predicate<String> methodRef1 = String::isEmpty;
		Predicate<String> lambda1 = s -> s.isEmpty();
		str.isEmpty();
		System.out.println(methodRef1.test(str));
		System.out.println(lambda1.test(str));
		
		
		BiPredicate<String, String> methodRef3 = String::startsWith;
		BiPredicate<String, String> lambda3 = (s, p) -> s.startsWith(p);
		methodRef3.test(str, "a");
		lambda3.test(str, "a");
		
		//Calling Constructors
		Supplier <List<String>> methodRef4 = ArrayList::new;
		Supplier<List<String>> lambda4= () -> new ArrayList();
		methodRef4.get();
		lambda4.get();
		
		
	}
}

//A method reference and a lambda behave the same way at runtime. You can pretend the compiler turns your method references into lambdas for you
//Method reference is used when we need to pass the input in a single method in our lambda