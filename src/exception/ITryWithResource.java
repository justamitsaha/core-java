package exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//Resources implementing Closable or AutoClosable can be used for try with resources
class MyFileReader implements AutoCloseable {
	private String tag;

	public MyFileReader(String tag) {
		System.out.println("constructor");
		this.tag = tag;
	}

	@Override
	public void close() {
		System.out.println("Closed: " + tag);
	}
}

public class ITryWithResource {
	public static void main(String[] args) throws IOException {
		tryWithResource1();
		tryWithResource2();
	}
	
	// the resource will be closed at the completion of the try block, before any
	// declared catch or finally blocks execute.
	public static void tryWithResource1() {
		try (var bookReader = new MyFileReader("monkey")) {
			System.out.println("Try Block");
		} finally {
			System.out.println("Finally Block");
			System.out.println("<------------>");
		}
	}

	// Starting with Java 9, it is possible to use resources declared prior to the
	// try‐with‐resources statement, provided they are marked final or effectively
	// final
	public static void tryWithResource2() throws IOException {
		final var bookReader = new MyFileReader("4");
		MyFileReader movieReader = new MyFileReader("6");
		// a try‐with‐resources statement can include multiple resources, which are
		// closed in the reverse order in which they are declared
		try (bookReader; var tvReader = new MyFileReader("5"); movieReader) {
			System.out.println("Try Block");
		} finally {
			System.out.println("Finally Block");
			System.out.println("<------------>");
		}
		//Not final
		Path path2 = null;
		var writer2 = Files.newBufferedWriter(path2);
		try (writer2) { // DOES NOT COMPILE
			writer2.append("Welcome to the zoo!");
		}
		//writer2 = null;
		
		Path path = null;
		var writer = Files.newBufferedWriter(path);
		//writer.append("This write is permitted but a really bad idea!");
		try(writer) {
		   writer.append("Welcome to the zoo!");
		}
		writer.append("This write will fail!");  // IOException
	}
}
