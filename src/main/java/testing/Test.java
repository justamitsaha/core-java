package testing;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Employee> set1 = new TreeSet<>(new SalaryComparator());
        set1.add(new Employee(50000, 28));
        set1.add(new Employee(23533, 33));
        set1.add(new Employee(92383, 33));
        set1.add(new Employee(7623, 43));
        System.out.println(set1);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee arg0, Employee arg1) {
        return arg0.salary - arg1.salary;
    }

}


class Employee implements Comparable<Employee> {
    int salary;
    int age;

    public Employee(int salary, int age) {
        super();
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee arg0) {
        return this.age - arg0.age;
    }

    @Override
    public String toString() {
        return "Employee [salary=" + salary + ", age=" + age + "]";
    }
}

















































