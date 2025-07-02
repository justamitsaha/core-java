package com.saha.amit;

public class Test {

    public static void main(String[] args) {
        byte i =4 ;
        byte j = 6;
        var k = i+j;

        Box b1 = new Box(1,1,1);
        Box b2 = b1;
        b1 = null;
        System.out.println(b2.length);

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


