package testing;

import java.util.Date;

public class Test {

    public static void main(String[] args) {



        int x, y, z;
        x = y = z = 22;


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


