package com.saha.amit;

public class Test {

    public static void main(String[] args) {
        test("hello");

    }

    public static void test(String s){
        String n = "hello";
        System.out.println(n +"--"+s);
        if (n == s) {
            System.out.println("match");
        } else {
            System.out.println("no match");
        }
    }

}

class Box {
    int height, width, length;

    int area() {
        return this.height * this.length * this.width;
    }

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
}


