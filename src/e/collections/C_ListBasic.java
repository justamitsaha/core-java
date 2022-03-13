package e.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class C_ListBasic {
	public static void main(String[] args) {
		// Arraylist uses an array as its underlying data stucture. Problem with array is that it is of fixed length while declaring. Array list fixes this creating
		// a new array behind the scene when any manipulation is done to list, This takes a lot of array and resources for any
		// modification of array list like add. But since it user array as underlying stcuture it is very fast in get operation
		List<String> ar = new ArrayList<String>();
		addValuesToList(ar);
		find(ar);
		
		// Linked list implements double linked list as underlying archirtecture where each element has a pointer to previous and next element as a result it is
		// very fast for doing any add operation but it is slow for get operation as it has to go through the linked list to get each element.
		List<String> ll = new LinkedList<>();
		addValuesToList(ll);
		find(ll);
		ll =ar;
	}

	static void addValuesToList(List<String> li) {
		Date d1 = new Date();
		for (int i = 0; i < 65000; i++) {
			li.add("Hello" + i);
		}
		Date d2 = new Date();
		long diff = d2.getTime() - d1.getTime();
		System.out.println(diff);
	}
	
	static void find(List<String> li) {
		Date d1 = new Date();
		li.get(15000);
		Date d2 = new Date();
		long diff = d2.getTime() - d1.getTime();
		System.out.println(diff);

	}
}
