package exception;

import java.io.FileNotFoundException;

class CannotSwimException extends Exception {

	private static final long serialVersionUID = 1L;

	public CannotSwimException() {
		super(); // Optional, compiler will insert automatically
	}

	public CannotSwimException(Exception e) {
		super(e);
	}

	public CannotSwimException(String message) {
		super(message);
	}
}

public class HCustomException {
	public static void main(String[] args) throws CannotSwimException {
		// throw new CannotSwimException();
		//throw new CannotSwimException("broken fin");
		throw new CannotSwimException(new FileNotFoundException("Cannot find shark file"));
	}
}
