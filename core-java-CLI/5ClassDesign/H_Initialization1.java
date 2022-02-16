// When initiating and Class which contais main() method below order is followed
// If there is a superclass Y of X, then initialize class Y first.
// Process all static variable declarations in the order they appear in the super class and class.
// Process all static initializers in the order they appear in the class.
// When the new is called then instance variables and code blocks are executed 
// Non static methiods and blocks are executed only when new() object is created for both the class and super class

//Here main is in same class so the Class is loaded 1st before main method
public class H_Initialization1 extends Animal {
    private String name = "BestZoo";
    { System.out.println(name + "-"); }
    static { System.out.println("100"); }

    public static void main(String[] grass) {
        System.out.println("main method");
        new H_Initialization1();
        new H_Initialization1();
    }
    H_Initialization1 () {System.out.println("Constructor");}
}

class Animal {
    static int count = 0;
    static {
        count += 10;
        System.out.println(count++);
        System.out.println(++count);
    }
    {
        System.out.println("Non static super code block");
    }
}
