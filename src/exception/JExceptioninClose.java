package exception;

class JammedTurkeyCage implements AutoCloseable {
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}
}

//When multiple exceptions are thrown, all but the first are called suppressed exceptions. The idea is that Java treats the first exception as the primary one and tacks on any that come up while automatically closing.
public class JExceptioninClose {
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			System.out.println("Put turkeys in");
		} catch (IllegalStateException e) {
			System.out.println("Caught: " + e.getMessage());
		}

		// If more than two resources throw an exception, the first one to be thrown  becomes the primary exception, with the rest being grouped as suppressed
		// exceptions. And since resources are closed in reverse order in which they are declared, the primary exception would be on the last declared resource that throws an exception.
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new IllegalStateException("Turkeys ran off");
		} catch (IllegalStateException e) {
			System.out.println("Caught: " + e.getMessage());
			for (Throwable t : e.getSuppressed())
				System.out.println("Suppressed: " + t.getMessage());
		}

		// Java remembers the suppressed exceptions that go with a primary exception even if we don't handle them in the code.
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new RuntimeException("Turkeys ran off");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}

		//The exception in finally is not suppressed exception so the exception in try is lost
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new IllegalStateException("Turkeys ran off");
		} finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}
}
