package com.saha.amit.inheritence;

import java.util.ArrayList;
import java.util.List;

class Head {
	void method1(List<Object> list1) {}
	void method2(List<Object> list1) {}
	
	public List<CharSequence> play() { 
		List<CharSequence> lst = new ArrayList<>();
		return lst;
	}
	
	@SuppressWarnings("unused")
	private String getNumberOfHumps() { return "Undefined";  }
}

public class GenericsOverride extends Head {
	void method(List<Object> list1) {}
	//void method(List<String> list2) {}
	
	//void method1(List<String> list1) {}
	
	//This is overloading
	void method2(ArrayList<String> list1) {}
	
	/*
	 * the return type of the class or interface declared in the overriding method
	 * must be a subtype of the class defined in the parent class. 
	 * public List<String> play() { List<String> lst = new ArrayList<>(); return lst; }
	 */
	
	@SuppressWarnings("unused")
	private int getNumberOfHumps() { return 1;  }
}


