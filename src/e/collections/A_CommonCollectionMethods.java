package e.collections;

import java.util.ArrayList;
import java.util.List;
//add(),size(),isEmpty(),contains(),forEach(),clear()
public class A_CommonCollectionMethods {

	static List<String> li = new ArrayList<>();
	public static void main(String[] args) {
		// Add
		li.add("alu");
		li.add("baigan");
		li.add("kathal");
		print(li);
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		System.out.println(li.contains("alu"));
		li.clear();
		System.out.println(li.size());
	}

	static void print(List<String> li) {
		for (String i : li) {
			System.out.print(i);
			System.out.println("");
		}
	}
}
