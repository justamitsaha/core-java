package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			readfile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static void readfile() throws FileNotFoundException {
		FileReader fr = new FileReader("test.txt");
	}

}
