package com.saha.amit;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Coding Exercise: Sum of Squares of First N Numbers
 * You are given an integer n. Your task is to implement a method calculateSumOfSquares in the class SumOfSquares
 * that calculates and returns the sum of squares of all positive integers up to n (inclusive).
 * For example, if n = 3, the method should return the sum 1^2 + 2^2 + 3^2 = 14.
 * If n is less than 0, the method should return -1.
 */
class SumOfSquares {
    public static void main(String[] args) {
        var x = new SumOfSquares().calculateSumOfSquares(5);
        System.out.println(x);
    }

    public long calculateSumOfSquares(int n) {
        //System.out.println(n);
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            Optional<Integer> lg = Stream.iterate(1, s -> s + 1)
                    .limit(n)
                    //.peek(System.out::println)
                    .reduce((a, b) -> {
                        System.out.println("a " + a);
                        System.out.println(b + " " + Math.pow(b, 2));
                        System.out.println("<-------->" + (a + (int) Math.pow(b, 2)));
                        return a + (int) Math.pow(b, 2);
                    });
            return lg.orElse(0);
        }
    }

}
