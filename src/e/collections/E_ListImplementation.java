package e.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_ListImplementation {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SD");                  
		list.add(0, "NY");               
		list.set(1, "FL");
		list.add(2, "LA");
		System.out.println(list); 
		list.remove("NY");               
		list.remove(0);    
		list.set(0, "?");                // Set will only add if the element is already present otherwise will throw IndexOutOfBoundsException
		System.out.println(list);
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		numbers.replaceAll(x -> x*2);
		System.out.println(numbers);   // [2, 4, 6]
		//immutable so below will throw exception UnsupportedOperationException
		//numbers.add(9);
		
		
		
	}

}
