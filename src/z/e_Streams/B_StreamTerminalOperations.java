package z.e_Streams;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class B_StreamTerminalOperations {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count());
		
		s = Stream.of("monkey", "gorilla", "bonobo");
		Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
		min.ifPresent(System.out::println); 
		
		Stream<Double> randoms = Stream.generate(Math::random);
		randoms.findAny().ifPresent(System.out::println);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		oddNumbers.findFirst().ifPresent(System.out::println);
		
		var list = List.of("monkey", "2", "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		 
		System.out.println(list.stream().anyMatch(pred));  // true
		System.out.println(list.stream().allMatch(pred));  // false
		System.out.println(list.stream().noneMatch(pred)); // false
		Stream<String> infinite = Stream.generate(() -> "chimp");
		System.out.println(infinite.anyMatch(pred));       // true
		
		Stream<String> s1 = Stream.of("Monkey", "Gorilla", "Bonobo");
		s1.forEach(System.out::print);
		
		
		//REDUCE example 1 ->> T reduce(T identity, BinaryOperator<T> accumulator)
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", (x, c) -> x + c);
		String word2 = stream.reduce("", String::concat);
		System.out.println(word); 
		System.out.println(word2);
		
		//REDUCE example 2 -->> Optional<T> reduce(BinaryOperator<T> accumulator)
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		 
		empty.reduce(op).ifPresent(System.out::println);         // no output
		oneElement.reduce(op).ifPresent(System.out::println);    // 3
		threeElements.reduce(op).ifPresent(System.out::println); // 90
		
		//REDUCE example 3 -->> <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
		Stream<String> stream1 = Stream.of("w", "o", "l", "f!");
		int length = stream1.reduce(0, (i, w) -> i+w.length(), (a, b) -> a+b);
		System.out.println(length);
		
	}

}
