package com.saha.amit;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * In this exercise, your task is to implement a method in the PerfectNumberChecker class that checks whether a number is a "perfect number".
 * A Perfect Number is a positive integer that is equal to the sum of all of its positive divisors, excluding itself.
 * For example, the number 6 is a perfect number because its divisors are 1, 2, and 3.
 * The sum of these divisors is equal to 6, so 6 is a perfect number. Similarly, 28 is also a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
 */
public class PerfectNumberChecker {

    public static void main(String[] args) {
        System.out.println(new PerfectNumberChecker().isPerfectNumber(28));
    }

    public boolean isPerfectNumber(int number) {
        if(number >0) {
            var count = IntStream.iterate(1, s -> s + 1)
                    .limit(number)
                    .filter(n -> number % n == 0 && n != number)
                    .peek(System.out::println)
                    .reduce(Integer::sum);
            return number == count.orElse(0);
        } else {
            return  false;
        }
    }
}
