package com.saha.amit;

public class Test {

    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        i1 = 128;
        i2 = 128;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));






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


