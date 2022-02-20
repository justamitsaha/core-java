package com.saha.amit.inheritence;

import java.io.FileNotFoundException;
import java.io.IOException;

class Bird {
	public void fly(int wings) { }
	//Since IOException is the parent of FileNotFoundException hence overriding methods won't face a problem
	CharSequence reproduce() throws IOException{ return "kid";}
	void hunt() throws FileNotFoundException{}
	void die() throws ArithmeticException {}
}

public class Eagle extends Bird {
	//Since the signature is changing hence its overloading so return type can be different
	public int fly() {return 5; }
	
	 //Since the Signature is same return type should be same or a sub type of parent 
	 //public int fly(int wings) { return wings;} 
	
	// String implements the CharSequence interface, making String a sub type of CharSequence also FileNotFoundException is a sub type of IOException
	@Override
	String reproduce() throws FileNotFoundException{return "lays egg";}

	//Since FileNotFoundException is a sub class of IOException below will not compile
	 //void hunt () throws IOException {System.out.println("hunting");} 
	void hunt () {System.out.println("hunting");}

	//No issues while overriding with checked exception
	@Override
	void die() throws IllegalArgumentException {}

	public static void main(String[] args) {}
}
