package z.f_primitiveStream;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce(0, (s, n) -> s + n)); 
		
		//Same thing
		
		Stream<Integer> stream1 = Stream.of(1, 2, 3);
		System.out.println(stream1.mapToInt(x -> x).sum());  // 6
		
		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());  // 2.0
		
		var random = DoubleStream.generate(Math::random);
		var fractions = DoubleStream.iterate(.5, d -> d / 2);
		random.limit(3).forEach(System.out::println);
		fractions.limit(3).forEach(System.out::println);
	}
}
