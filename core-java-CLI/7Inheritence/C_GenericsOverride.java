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
	
	private String getNumberOfHumps() { return "Undefined";  }
}

public class GenericsOverride extends Head {
	void method(List<Object> list1) {}
	//void method(List<String> list2) {}
	//Since both will compile to List var, hence signature is same, so it will duplicate not overloadind hence won't compile

	//void method1(List<String> list1) {}
	//Altough logiclally this should work and child is having same signature as parent so should override but for consistence Java doen't allow this
	
	//This is overloading sicne signature is changing
	void method2(ArrayList<String> list1) {}
	
	/*
	 * the return type of the class or interface declared in the overriding method
	 * must be a subtype of the class defined in the parent class. 
	 * public List<String> play() { List<String> lst = new ArrayList<>(); return lst; }
	*/
	
	@SuppressWarnings("unused")
	private int getNumberOfHumps() { return 1;  }
}

//Key	1> In older Java version {List<Object> var} and {List<String> var} for eg. will both compile to {List var}


