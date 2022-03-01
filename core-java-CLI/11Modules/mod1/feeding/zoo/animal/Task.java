// javac --module-path mods -d feeding feeding/zoo/animal/*.java feeding/*.java
// javac -p mods -d feeding feeding/zoo/animal/*.java feeding/*.java
// java --module-path feeding --module zoo.animal/zoo.animal.Task
// java -jar -cvf mods/zoo.animal.jar -C feeding/ 
package zoo.animal;

public class Task {
    public static void main(String... args) {
        System.out.println("All fed!");
     }
}
