import java.io.FileNotFoundException;
import java.io.IOException;
//When Parent and Child methods have same signature its called overriding
public class B_Overriding{ public static void main(String[] args) {}}
class Bird {
	public void fly(int wings) { }
	CharSequence reproduce() throws IOException{ return "kid";}
	void hunt() throws FileNotFoundException{}
	void die() throws ArithmeticException {}
}

class Eagle extends Bird {
	public int fly() {return 5; }
	//Since the method signature is changing hence its overloading so return type can be different
	//public int fly(int wings) { return wings;} 
	//Since the Signature is same return type should be same or a sub type of parent 
	
	@Override
	String reproduce() throws FileNotFoundException{return "lays egg";}
	//Here Return type is changing but since String implements CharSequence hence it works
	//Also FileNotFoundException is a child class of IOException so no issue

	//void hunt () throws IOException {System.out.println("hunting");} 
	//Here parent method is declaring FileNotFoundException which is subclass of IOException  hence above method does not compile but below method compiles since it is not declaring any exception
	void hunt ()  {System.out.println("hunting");}

	@Override
	void die() throws IllegalArgumentException {}
	//No issues while overriding with checked exception

}

//Key  	1 >Overriding is a process by which a child class can extent a parent class and access its methods
//		2 >Method must have same signature and return type and method name
//		3 >Return type of child class should be same or subclass of the return type of parent
//		4 >If parent method is declaring a Unchecked exception then child class can't declare an exception broader than that of parent method
//		5 >But child can choose to declare no exception or RunTime/Checked exception if parent method has declared checked exception
//		6 >If parent class has declared RunTime/Checked exception then there is no restriction
