package com.saha.amit.stream;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class StreamMain {

    public static final Faker faker = new Faker();
    private static final Logger logger = LoggerFactory.getLogger(StreamMain.class);

    public static void main(String[] args) {
        String st = "hello";
        var x = st
                .chars()
                .peek(value -> logger.info("Peek1 {}", value))
                .mapToLong(value -> value)
                .peek(s -> logger.info("Peek2 {}", s))
                .sum();

        st
                .chars()
                .mapToObj(value -> (char) value)
                .forEach(s -> logger.info("Peek3 {}", s));


    }
}
