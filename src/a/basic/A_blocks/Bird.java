package a.basic.A_blocks;
public class Bird {
    //This is a field
    String name;
    // Below is an instance initializers and will not compile with out braces and it will execute only when constructor is called or instance is initialized
    {
        System.out.println("This will print only when there is a constructor in main method " + name);
    }

    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Instance initializer couner " + i);
        }
    }

    public static void main(String[] args) {
        // If the below constructor is removed the above sysout will not execute
        Bird bird = new Bird();
        bird.name ="sparrow";
        // Below is not instance initializers since it is inside a method
        {
            System.out.println("Feathers Bal" +bird.name);
        }
    }
}
