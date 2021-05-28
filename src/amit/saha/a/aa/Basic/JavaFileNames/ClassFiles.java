package amit.saha.a.aa.Basic.JavaFileNames;
//Multiple Classes can be in a file as long as there is only one public class

//Below class is public so it has to match file names
public class ClassFiles {
	
	public static void main(String[] args) {
		ClassFiles cf = new ClassFiles();
		cf.getName();
		Animal2 an =  new Animal2();
		an.getName();
	}

	public String getName() {
		System.out.println("Poo!");
		return "poo";
	}
}

//Since this class is not public it can stay in a file with different name 
class Animal2 {
	public String getName() {
		System.out.println("Welcome!");
		return "poo";
	}
}
