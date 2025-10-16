package com.saha.amit.basic;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Basic {
    private static final Logger log = LoggerFactory.getLogger(Basic.class);
    private static final Faker faker = new Faker();

    public static void main(String[] args) {
//        int input = faker.number().numberBetween(999, 9999);
//        log.info("Input: {}, Sum: {}", input, sumOfDigit(input));
        int[] integers = new int[4];
        for (int i = 0; i < 4; i++) {
            integers[i] = faker.number().numberBetween(999, 9999);
        }
        log.info("array: {}, largest {}", integers, findLargest(integers));
    }

    public static int findLargest(int[] integer) {
        Arrays.stream(integer)
                .reduce((integer1, integer2) -> {
                    int largest = 0;
                    if (integer1 > integer2) {
                        log.info("integer1 > integer2 {}, {}", integer1, integer2);
                        largest = integer1;
                    } else {
                        log.info("integer1 < integer2 {}, {}", integer1, integer2);
                        largest = integer2;
                    }
                    return largest;
                });
        return integer[0];
    }

    public static int sumOfDigit(Integer number) {
        log.info("Input: {}", number);
        int result = number.toString().chars()
                .mapToObj(operand -> (char) operand)
                //.peek(value -> log.info("Char {} ", value))
                //.mapToInt(value -> value)
                //.peek(character -> log.info("Int {}", character))
                .map(character -> Character.getNumericValue(character))
                .reduce(0,
                        Integer::sum);
        return result;
    }

    public static void swap(int a, int b){
        log.info("a: {}, b: {}",a, b);

    }
}
