package testing;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Stream<String> newstream = Stream.of("w", "o", "l", "f");
        String word = stream
                .reduce(
                        "",
                        (x, c) -> x + c);
        String word2 = newstream.reduce(
                "",
                String::concat);
        System.out.println(word);
        System.out.println(word2);
    }
}



















































