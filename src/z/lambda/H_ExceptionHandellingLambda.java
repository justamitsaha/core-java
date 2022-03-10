package z.lambda;

import java.util.function.BiConsumer;

public class H_ExceptionHandellingLambda {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 8 };
		int key = 2;

		mathOpersation(arr, key, (i, k) -> {
			try {
				System.out.println(i / k);
			} catch (Exception e) {
				System.err.println(e);
			}
		});
	}

	private static void mathOpersation(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : arr) {
			consumer.accept(i, key);
		}
	}
}
