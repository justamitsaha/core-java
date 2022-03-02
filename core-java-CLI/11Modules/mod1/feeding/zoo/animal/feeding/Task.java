// javac --module-path mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java
// javac -p mods -d feeding feeding/zoo/animal/feeding/*.java feeding/*.java
// java --module-path feeding --module zoo.animal.feeding/zoo.animal.feeding.Task 
// jar -cvf mods/zoo.animal.feeding.jar -C feeding/
// jar -cvf mods/zoo.animal.feeding.jar feeding
package zoo.animal.feeding;

public class Task {
    public static void main(String... args) {
        System.out.println("All fed!");
     }
}
