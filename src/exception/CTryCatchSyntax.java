package exception;

 
public class CTryCatchSyntax {
 
    public static void main(String[] args) {
        try {
        } catch (NumberFormatException e) { // DOES NOT COMPILE if this is placed below as NumberFormatException is a
                                            // subclass of IllegalArgumentException
        } catch (IllegalArgumentException e) {
        }
 
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }
        // Above can be written in below format also which is better sysntax
 
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e1) {
            System.out.println("Missing or invalid input" +e1);
        }
 
        // catch(Exception1 e | Exception2 e | Exception3 e) // DOES NOT COMPILE
        // catch(Exception1 e1 | Exception2 e2 | Exception3 e3) // DOES NOT COMPILE
 
        // DOES NOT COMPILE Since FileNotFoundException is a subclass of IOException,
        // try {
        // throw new IOException();
        // } catch (FileNotFoundException | IOException p) {
 
        // }
        
        try {
            test();
        } catch (NullPointerException e) {  // Can put any RunTimException here but not Checked as test() doesn't have any 
            
        }
 
    }
 
    // The throw in try and catch is forgotten and finally exception in finally gets
    // executed
    @SuppressWarnings("finally")
	public static void throwException() throws Exception {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }
    }
 
    public static void test() {
        System.out.println();
    }
}
