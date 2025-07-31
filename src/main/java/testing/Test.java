package testing;

import java.util.Date;

public class Test {
    static {
        System.out.println("Block 1");
    }

    {
        System.out.println("Block 3");
    }

    Test() {
        System.out.println("This is constructor 4");
    }

    public static void main(String[] args) {
        System.out.println("Main 2");
        Test test = new Test();
    }
}

class Box {
    int height, breath, length;

    Box() {
    }

    Box(int height, int breath, int length) {
        this.height = height;
        this.breath = breath;
        this.length = length;
    }
}




