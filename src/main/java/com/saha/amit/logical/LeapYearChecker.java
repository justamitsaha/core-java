package com.saha.amit.logical;

/**
 * You are given a class LeapYearChecker with a method isLeapYear(int year). Your task is to complete the implementation of the method to determine if a given year is a leap year.
 * The rules are a little tricky. Read them carefully.
 * A year is a leap year in the Gregorian calendar if:
 * It is divisible by 4 (AND)
 * It is NOT divisible by 100 (except when it is divisible by 400)
 * Not Divisible by 4 - NOT Leap Year (2041)
 * Divisible by 4 and NOT divisible by 100 - Leap Year (2048)
 * Divisible by 4 and divisible by 100 - Additional check needed
 * Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)
 * Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)
 */
public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println(new LeapYearChecker().isLeapYear(2000));
        System.out.println(new LeapYearChecker().isLeapYear(2004));
        System.out.println(new LeapYearChecker().isLeapYear(2400));
        System.out.println(new LeapYearChecker().isLeapYear(0));
    }

    public boolean isLeapYear(int year) {
        return ((year > 1) && (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }


}
