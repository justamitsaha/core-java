package z.e_Streams;

import java.util.stream.Stream;

public class D_Tricks {

	public static void main(String[] args) {
		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);

		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
	}

}
