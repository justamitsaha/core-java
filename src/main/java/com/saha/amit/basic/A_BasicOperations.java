package com.saha.amit.basic;

import com.saha.amit.dto.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A_BasicOperations {

    private static final Logger logger = LoggerFactory.getLogger(A_BasicOperations.class);

    public static void main(String[] args) {
        // Only i initialized not j also can use un-initialized local variables Class level variables get default values
        int i, j = 8;
        int k = 8, l = 8; //both initialized

        // Call be Value k is not changed
        logger.info("Value of K: {}", k);  // value 8
        doubleValue(k);
        logger.info("Value of K: {}", k);  //value still 8

        //Still call be value but for objects value is the memory location
        Employee employee = new Employee("Amit", 20);
        changeEmployee(employee);
        logger.info("Employee details: {}", employee.toString()); //value changed

        logger.info("k *= 2 equals: {} ", k *= 2);
        logger.info("k += 4 equals: {} ", k += 4);
        logger.info("k -= 4 equals: {} ", k -= 4);
        logger.info("k /= 2 equals: {} ", k /= 2);
    }

    public static void doubleValue(int i) {
        i = i * 2;
    }

    public static void changeEmployee(Employee employee) {
        employee.setName("Adam");
        employee.setSalary(34);

    }


}

