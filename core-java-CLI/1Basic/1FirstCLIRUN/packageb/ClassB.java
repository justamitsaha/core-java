package packageb;
import packagea.ClassA;

public class ClassB{
	public static void main(String[] args) {
		try{
			System.out.println("Class B sysout");
			ClassA ca = new ClassA() ;
			ca.someMethod();
		} catch (Exception e){
			System.out.println(e);
		}
	}
}