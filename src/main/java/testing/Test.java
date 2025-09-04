package testing;


import java.io.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;


// A normal (non-generic) class with bounded generic methods
public class Test {

    // Bounded generic method - only works on Comparable types
    public static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

    // Generic constructor with bounded type
    public <T extends Number> Test(T value) {
        System.out.println("Generic constructor with Number: " + value);
    }

    public static void main(String[] args) {
        // ✅ Works because String implements Comparable<String>
        System.out.println("Compare Strings: " + compare("apple", "banana"));

        // ✅ Works because Integer implements Comparable<Integer>
        System.out.println("Compare Integers: " + compare(10, 20));

        // ❌ Compile-time error: Person does not implement Comparable
        // Person p1 = new Person("Amit");
        // Person p2 = new Person("Saha");
        // System.out.println(compare(p1, p2));

        // Using bounded generic constructor (only Numbers allowed)
        Test obj1 = new Test(123);
        // BoundedGenericMethodExample obj2 = new BoundedGenericMethodExample("Hello"); // ❌ error, not Number
    }
}


class Employee {
    int salary;
    int age;

    public Employee(int salary, int age) {
        super();
        this.salary = salary;
        this.age = age;
    }
}






























