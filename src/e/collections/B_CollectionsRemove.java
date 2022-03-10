package e.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class B_CollectionsRemove {
	static List<String> li = new ArrayList<>();
	public static void main(String[] args) {
		li.add("alu");
		li.add("baigan");
		li.add("kathal");
		li.add("gobi");
		li.add("tamatar");
		
		li.remove(4);		// Can throw IndexOutOfBoundsException if try to remove position not present
		System.out.println(li.remove("mushroom"));
		print();
		
		
		
		for (String st : li) {
			//ConcurrentModificationException
			li.remove(st);				
			li.removeIf( a -> a.equalsIgnoreCase("baigan"));
		}
	}
	
	static void print() {
		for (String i : li) {
			System.out.print(i);
			System.out.println("");
		}
	}
}
