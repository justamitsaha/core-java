package com.saha.amit.basic;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Basic {
    private static final Logger log = LoggerFactory.getLogger(Basic.class);
    private static final Faker faker = new Faker();
    static int[] integers = new int[4];
    static int input = 0;
    static int smallInput = 0;

    static {
        log.info("Initializing");
        input = faker.number().numberBetween(999, 9999);
        smallInput = faker.number().numberBetween(0, 25);
        for (int i = 0; i < integers.length; i++) {
            integers[i] = faker.number().numberBetween(999, 9999);
        }
    }

    public static void main(String[] args) {
        log.info("Input: {}, Sum: {}", input, sumOfDigit(input));
        log.info("array: {}, largest {}", integers, findLargest(integers));
        log.info("array: {}, largest {}", integers, findLargest2(integers));
        log.info("array: {}, 2nd largest {}", integers, findSecondLargest(integers));
        swapWithoutTempVariable();
        log.info("Factorial of: {} is: {} ", smallInput, factorial(smallInput));
    }


    public static int sumOfDigit(Integer number) {
        //Approach 1 using loop
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10; //This is equivalent to a = a / b;
        }
        //log.info("Sum using basic loop {}",String.valueOf(sum));

        /*
        .mapToInt(value -> value) is commented because it does not convert characters to digits.
        It simply keeps the Unicode / ASCII value of each character.
        e.g. "123".chars().mapToInt(value -> value).forEach(System.out::println);  //will give 49, 50, 51
         */
        return number.toString().chars()
                .mapToObj(operand -> (char) operand)
                .map(Character::getNumericValue)
                //.mapToInt(value -> value)
                .reduce(0,
                        Integer::sum);
    }

    public static int findLargest(int[] integer) {
        var result = Arrays.stream(integer)
                .reduce((integer1, integer2) -> {
                    int largest = 0;
                    if (integer1 > integer2) {
                        largest = integer1;
                    } else {
                        largest = integer2;
                    }
                    return largest;
                });
        //When no identity value is provided, the result is wrapped in an Optional to handle the case of an empty stream.
        return result.orElse(0);
    }

    public static int findLargest2(int[] numbers) {
        /*Pro -->Fastest (O(n)) Works for primitives and doesn’t box/unbox No extra memory Easy to understand
        Con Verbose Must handle empty array manually*/
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        //log.info("Largest using basic loop: {}", max);

        //here 0 is identity value hence no optional is required
        return Arrays.stream(numbers)
                .reduce(0, Integer::max);
    }

    public static int findSecondLargest(int[] numbers) {
        /*
        Pro -->Fastest (O(n)) Works for primitives and doesn’t box/unbox No extra memory Easy to understand
        Con Verbose Must handle empty array manually
         */
        if (numbers == null || numbers.length < 2) {
            return -1; // Not enough elements
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        //log.info("Second Largest using basic loop: {}", secondLargest);
        return secondLargest;
    }

    public static void swapWithoutTempVariable() {
        int a = 5;
        int b = 10;
        log.info("Before Swap: a = {}, b = {}", a, b);
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10
        log.info("After Swap: a = {}, b = {}", a, b);
    }

    public static long factorial(int input) {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        //return result;
        return Stream.iterate(1, i -> i + 1)
                .limit(input)
                .reduce(1, (i, j) -> i * j);
    }

    public static boolean primeCheck(int input) {
        if (input <= 1) return false;  // 0, 1 are not prime
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        //return true;

        if (input <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(input))
                .noneMatch(i -> input % i == 0);
    }


    public static void fibonacciPrint(int limit) {
        long first = 0, second = 1;
        System.out.print("Fibonacci: " + first + " " + second);
        for (int i = 2; i <= limit; i++) {
            long next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();

        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(limit + 1)
                .mapToLong(f -> f[0])
                .max()
                .orElse(0);
    }


    public static Map<String, Integer> countWordFrequency(String str) {
        log.info("Input: {}", str);

        // Normalize input — lowercase and remove punctuation
        str = str.toLowerCase().replaceAll("[^a-z\\s]", ""); // keep only letters and spaces

        String[] words = str.split("\\s+"); // split by one or more spaces

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        log.info("Word Frequency: {}", wordCount);
        return wordCount;
    }

    public static Map<String, Long> countWordFrequencyStream(String str) {
        return Arrays.stream(str.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+"))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


}
