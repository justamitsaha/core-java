package z.e_Streams;

import java.util.List;
import java.util.stream.Stream;

public class C_IntermediateOperations {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
		stream.filter(x -> x.startsWith("m")).forEach(System.out::print);

		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
		s.distinct().forEach(System.out::print);

		Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
		s2.skip(5).limit(2).forEach(System.out::print);

		Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
		s3.map(String::length).forEach(System.out::print);

		List<String> zero = List.of();
		var one = List.of("Bonobo");
		var two = List.of("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(m -> m.stream()).forEach(System.out::println);

	}
}
