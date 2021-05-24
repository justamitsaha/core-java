package amit.saha.a.classesFileNames;

public class MainClass {

	// The variable name args hints that this list contains values that were read in when run from command line 
	//eg
	//javac MainClass.java
	//java MainClass Bronx Zoo
	// (arguments) when the JVM started
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		ClassesFiles cf = new ClassesFiles();
		cf.getName();

		Animal2 an = new Animal2();
		an.getName();

	}

}
