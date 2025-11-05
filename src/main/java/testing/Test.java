package testing;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Set<Employee> set1 = new TreeSet<>(Comparator.comparing(employee -> employee.salary));
        set1.add(new Employee(50000, 28));
        set1.add(new Employee(23533, 33));
        set1.add(new Employee(92383, 8));
        set1.add(new Employee(7623, 43));
        System.out.println(set1);
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


    @Override
    public String toString() {
        return "Employee [salary=" + salary + ", age=" + age + "]";
    }
}




















































