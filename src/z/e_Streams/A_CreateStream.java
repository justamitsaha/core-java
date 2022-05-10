package z.e_Streams;

import java.util.List;
import java.util.stream.Stream;

public class A_CreateStream {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Empty Stream
		Stream<String> empty = Stream.empty(); // count = 0
		
		//Stream from elements
		Stream<Integer> singleElement = Stream.of(1); // count = 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3

		//Stream from collections
		var list = List.of("a", "b", "c");
		Stream<String> fromList = list.stream();
		//parallel stream
		Stream<String> fromListParallel = list.parallelStream();

		//Infinite Stream
		//Stream.generate(supplier)
		Stream<Double> randoms = Stream.generate(Math::random);
		//Stream.iterate(seed, unaryOperator)
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		Stream.generate(() -> "Elsa");
		
		//Stream.iterate(seed, predicate, unaryOperator)
		Stream<Integer> oddNumberUnder100 = Stream.iterate(1, n -> n < 100, n -> n + 2);
		System.out.print(oddNumberUnder100);
	}
}
