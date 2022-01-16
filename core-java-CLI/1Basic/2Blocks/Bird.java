public class Bird {
    //This is a field
    String s;
    // Below is an instance initializers
    // below code will not compile with out braces
    {
        System.out.println("This will print only when there is a constructor in main method");
    }

    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Instance initializer couner " + i);
        }
    }

    public static void main(String[] args) {
        // If the below constructor is removed the above sysout will not execute
        Bird bird = new Bird();
        // Below is not instance initializers since it is inside a method
        {
            System.out.println("Feathers Bal");
        }
    }
}
