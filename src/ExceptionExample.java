import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

	public static void main(String[] args) {
		printThing();
		try {
			readfile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void readfile() throws FileNotFoundException  {
		FileReader fr = new FileReader("test.txt");
	}
	
	public static void printThing() throws NullPointerException {
		System.out.println("test");
	}

}
