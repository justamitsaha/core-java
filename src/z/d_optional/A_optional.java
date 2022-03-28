package z.d_optional;

import java.util.Optional;

public class A_optional {
	public static void main(String[] args) {

		System.out.println(average(90, 100)); // Optional[95.0]
		System.out.println(average()); // Optional.empty

		Optional<Double> opt = average(90, 100);
		if (opt.isPresent())
			System.out.println(opt.get()); // 95.0
		
		opt.ifPresent(System.out::println);  //Calls Consumer with value
		
		Optional<Double> opt1 = average();
		//System.out.println(opt1.get()); // NoSuchElementException
		
		
		Optional<Double> opt2 = average();
		System.out.println(opt2.orElse(Double.NaN));
		System.out.println(opt2.orElseGet(() -> Math.random()));
		//System.out.println(opt2.orElseThrow()); // NoSuchElementException
		System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));  //Throws exception created by calling Supplier
		
		
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}
}
