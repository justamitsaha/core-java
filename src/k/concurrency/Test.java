package k.concurrency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Test {
	public static void main(String[] args) throws IOException {

		final var bookReader = new MyFileReader("4");
		MyFileReader movieReader = new MyFileReader("6");
		try (bookReader; var tvReader = new MyFileReader("5"); movieReader) {
			System.out.println("Try Block");
		} finally {
			System.out.println("Finally Block");
		}
	}
}

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