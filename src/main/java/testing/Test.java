package testing;


public class Test {

    public static void main(String[] args) {
        Box b = new Box(1,1,1);
        changeValue(b.height);
        System.out.println(b.height);
        changeValue(b);
        System.out.println(b.height);
        changeObject(b);
        System.out.println(b.height);

    }

    static void changeValue(int i) {
        i++;
    }

    static void changeValue(Box b) {
        b.height++;
    }

    static void changeObject(Box b){
        b = new Box(10,10,10);
    }
}


class Box {
    int height, breath, length;

    public Box(int height, int breath, int length) {
        this.height = height;
        this.breath = breath;
        this.length = length;
    }
}








