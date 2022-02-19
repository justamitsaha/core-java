package com.saha.amit.inheritence;

import java.io.FileNotFoundException;
import java.io.IOException;

class Bird {
	public void fly() {
		System.out.println("Bird is flying");
	}
	public void eat(int food) {
		System.out.println("Bird is eating " + food + " units of food");
	}
	
	//Since IOException is the parent of FileNotFoundException hence overriding methods won't face a problem
	Object reproduce() throws IOException{ Object obj = new String("lays egg");return obj;}
	
	void hunt() throws FileNotFoundException{}
	
	//No issues while overriding with checked exception
	void die() throws ArithmeticException {}
}

public class Eagle extends Bird {
	//Since the signature is changing hence its overloading so return type can be different
	public int fly(int height) {
		System.out.println("Bird is flying at " + height + " meters");
		return height;
	}

	/*
	 * Since the Signature is same return type should be same or a sub type of
	 * parent public int eat(int food) { System.out.println("Bird is eating " + food + " units of food"); return food;}
	 */
	
	// Since String is a sub type of Object this will compile
	@Override
	String reproduce() throws FileNotFoundException{return "lays egg";}

	/*
	 * Since FileNotFoundException is a sub class of IOException below will not compile since child class may not declare
	 * a checked exception that is new or broader than the class of any exception declared in the parent class  
	 void hunt () throws IOException {System.out.println("hunting");} */
	void hunt () {System.out.println("hunting");}
	
	
	@Override
	void die() throws IllegalArgumentException {}

	public static void main(String[] args) {}
}
