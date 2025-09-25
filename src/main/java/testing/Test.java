package testing;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Faker faker = new Faker();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(faker.gameOfThrones().character());
        }
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());    // will print in forward directions
        }
        while (iterator.hasPrevious()) {             // will print in backward directions
            System.out.println(iterator.previous());
        }
    }
}










































