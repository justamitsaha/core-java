package testing;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(31312);
        System.out.println(date);
        System.out.println(date1);

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


