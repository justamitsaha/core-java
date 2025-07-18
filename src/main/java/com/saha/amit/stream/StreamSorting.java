package com.saha.amit.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 78, 5, 9, 3, 7, 72, 7, 8734));
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Sam", 34),
                new Person("Tom", 23),
                new Person("Bill", 45),
                new Person("Jam", 28)));
        List<Person> people = personList.stream().sorted().collect(Collectors.toList());
        System.out.println(people);

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
