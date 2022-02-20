// When initiating and Class which contais main() method below order is followed
// All static variable and static blocks of the Superclass are executed first
// All static variable and static blocks of the Childclass are executed next
// Main method starts executing next
// When new() is called, Non static code of Superclass executed followed by Superclass constructor code
// Non static code of Childclass is called followed by Childclass constructor code
//Here main is in same class so the Class is loaded 1st before main method
public class H_Initialization1 extends Animal {
    static { System.out.println("Childclass static 100"); }
    private String name = "Non static var";
    { System.out.println(name + "-"); }
    public static void main(String[] grass) {
        System.out.println("Main method");
        new H_Initialization1();
        //new H_Initialization1();
    }
    H_Initialization1 () {System.out.println("Childclass Constructor");}
}
class Animal {
    static int count = 0;
    static {
        count += 10;
        System.out.println("Superclass static "+ count++);
        System.out.println("Superclass static "+ ++count);
    }
    { System.out.println("Non static super code block"); }
    Animal() {System.out.println("Superclass Constructor");}
}
