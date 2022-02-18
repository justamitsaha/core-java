package com.saha.amit.inheritence;

class Bird {
	public void fly() {
		System.out.println("Bird is flying");
	}
	public void eat(int food) {
		System.out.println("Bird is eating " + food + " units of food");
	}
	
	Object reproduce() {
		Object obj = new String("lays egg");
		return obj;
	}
}

public class Eagle extends Bird {
	//Since the signature is changing hence its overloading so return type can be different
	public int fly(int height) {
		System.out.println("Bird is flying at " + height + " meters");
		return height;
	}
//	Since the Signature is same return type should be same or a sub type of parent
//	public int eat(int food) { // DOES NOT COMPILE
//		System.out.println("Bird is eating " + food + " units of food");
//		return food;
//	}
	// Since String is a sub type of Object this will compile
@Override
	String reproduce() {
		return "lays egg";
	}
	public static void main(String[] args) {
	}

}
