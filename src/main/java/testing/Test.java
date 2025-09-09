package testing;

import java.util.ArrayList;
import java.util.List;

class Human {
}

class Employee extends Human {
}

class Developer extends Employee {
}

class SeniorDev extends Developer {
}

public class Test {
    public static void main(String[] args) {
        List<Developer> list = new ArrayList<>();
        print(list);

        List<SeniorDev> seniorDevs = new ArrayList<>();
        print(seniorDevs);

        List<Human> humans = new ArrayList<>();
        //print(humans); will not compile as humans don't extend Employee

    }

    static void print(List<? extends Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}

























