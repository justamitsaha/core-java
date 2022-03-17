package z.c_functionalInterface;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

//A Supplier is used when you want to generate or supply values without taking any input. 
//public interface Supplier<T> { T get();}
public class A_SupplierFunctionalInterface {

	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		System.out.println(d1 +"<--->"+d2);
		
		//A Supplier is often used when constructing new objects.
		Supplier<StringBuilder> sb1 = StringBuilder::new;
		Supplier<StringBuilder> sb2 = () -> new StringBuilder("hello");
		System.out.println(sb1.get() +"<---->"+sb2.get());
		
		Supplier<String> su = () -> Integer.toString(new Random().nextInt());
		String random = su.get();
		System.out.println(su + " <----> "+random);
	}

}
