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
        List<Employee> list = new ArrayList<>();
        list.add(new Employee());
        print(list);
    }

    static void print(List<? super Developer> list){
        for (Object employee:list){
            System.out.println(employee);
        }
    }
}





























