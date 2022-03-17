package z.a_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import DTO.Animal;

//Predicate<T> is a functional interface with abstract method  boolean test(T t); It takes an object and returns boolean
public class D_PredicateFunctionalInterface {
	public static void main(String[] args) {
		List<Animal> lst = Arrays.asList(
				new Animal("monkey", false, false), 
				new Animal("snake", false, true),
				new Animal("sparrow", true, false), 
				new Animal("duck", true, true));

		checkAnimalCapabilities(lst, a -> a.canFly);
	}

	static void checkAnimalCapabilities(List<Animal> lst, Predicate<Animal> pd) {
		for (Animal an : lst) {
			if (pd.test(an)) {
				System.out.println(an.name + "Can fly");
			}
		}
	}
}


