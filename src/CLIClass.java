//Run Below cmd in CLI so see the output
//javac CLIClass.java
//java CLIClass "Bal" "Chal"
//Below will throw error
// java CLIClass "Bal"


//Starting in Java 11, you can run a program without compiling it first—well, without typing the javac command
//But need to provide .java extension with java file name 
//java CLIClass.java "Bal" "Chal"

//it can be used only if your program is one file. This means if your program has two .java files, you still need to use javac
public class CLIClass {

	public static void main(String[] args) {
		System.out.println("Main method sysout "+args[0]);
		System.out.println("Main method sysout "+args[1]);

	}

}
