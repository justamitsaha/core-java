package z.a_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import DTO.Animal;

public class E_ConsumerFunctionalInterface {

	public static void main(String[] args) {
		List<Animal> lst = Arrays.asList(
				new Animal("monkey", false, false), 
				new Animal("snake", false, true),
				new Animal("sparrow", true, false), 
				new Animal("duck", true, true));

		printAnimalCapabilities(lst, a -> {
			String capabilities = a.name;
			if (a.canFly) {
				capabilities = capabilities.concat(" can fly");
			} else {
				capabilities = capabilities.concat(" can't fly");
			}
			if (a.canSwim) {
				capabilities = capabilities.concat(" can swim");
			} else {
				capabilities = capabilities.concat(" can't swim");
			}
			System.out.println(capabilities);
		});
	}

	static void printAnimalCapabilities(List<Animal> lst, Consumer<Animal> cu) {
		for (Animal animal : lst) {
			cu.accept(animal);
		}
	}
}
