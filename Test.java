//Explain this when Square b1 is made null b2 still hold the reference to original object but this doesn't happen for String and Integer
public class Test {
    public static void main(String[] args) {
        // Suqaure b1 = new Suqaure(11, 12);
        // Suqaure b2 = b1;
        // b1.length = 24; // When one property of b1 is changed b2 also gets changed
        // System.out.println(b2.length);
        // b1 = null; // But when b1 is pointed to null b2 still points to previous
        // object
        // System.out.println(b2.length);

        // String s1 = "Hello";
        // String s2 = "Hello";
        // System.out.println(s1 == s2); //true
        // s1 = new String("hello");
        // s2 = new String("hello");
        // System.out.println(s1 == s2); //false

        String s1 = "Hello";
        s1.concat(" World");
        System.out.println(s1); // Prints “Hello”

        // Integer i1 = 12;
        // Integer i2 = i1;
        // i1 = 13; // I2 still holds the old value
        // System.out.println(i1 + " " + i2); // 13 12
    }
}

class Suqaure {
    int length, bredth;

    public Suqaure(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }
}
