import java.io.FileNotFoundException;
import java.io.FileReader;

public class BExceptionExample {

	public static void main(String[] args) {
		try {
			readfile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void readfile() throws FileNotFoundException {
		FileReader fr = new FileReader("test.txt");
	}

}
