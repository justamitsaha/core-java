import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class ETryWithResource {
 
    public static void main(String[] args) {
        readFile();
        try {
            readFile2();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        // DOES NOT COMPILE as s doesn't have scope in catch
        // try (Scanner s = new Scanner(System.in)) {
        //  s.nextLine();
        // } catch (Exception e) {
        //  s.nextInt(); 
        // }
 
 
        //Does not compile as resource type Test does not implement java.lang.AutoCloseable Test.java
        // try (Test s = new Test()) {
        // } 
    }
    //try-with-resources statement to automatically close all resources opened in a try clause.Behind the scenes, the compiler replaces a try-with-resources block with a try and finally block. We refer to this “hidden” finally block as an implicit finally block since it is created and used by the compiler automatically.
    public static void readFile() {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //here we can have a try statement without catch or finally as finally is created behind the scene
    public static void readFile2() throws FileNotFoundException, IOException {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        }
 
        //multiple variable
        try (FileInputStream ab = new FileInputStream("myfile.txt");
                FileInputStream cd = new FileInputStream("myfile.txt")) {
        }
    }
 
}
