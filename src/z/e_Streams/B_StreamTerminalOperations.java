package z.e_Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class B_StreamTerminalOperations {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count());
		
		s = Stream.of("monkey", "gorilla", "bonobo");
		Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
		min.ifPresent(System.out::println); 
	}

}
