package testing;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    private final static Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 3, "B", 1, "C", 5);
        var x = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(stringIntegerEntry -> stringIntegerEntry.getKey(),
                                stringIntegerEntry -> stringIntegerEntry.getValue(),
                                (o, o2) -> o,
                                new LinkedHashMap<String,Integer>()
                                )
                );
        System.out.println(x);
    }
}




















































