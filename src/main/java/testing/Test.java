package testing;


import java.io.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;


class Response<T> {

    private T response;
    private String code;
    public T getResponse() {
        return response;
    }
    public void setResponse(T response) {
        this.response = response;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

}

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();


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






























