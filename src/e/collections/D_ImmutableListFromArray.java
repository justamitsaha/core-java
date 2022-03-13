package e.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Underlying implementation of Arraylist involves an Array. This helps in overcoming the issue of fixed length of array. 
//However when arraylist is created from Array it still has that limitation as it is immutable
public class D_ImmutableListFromArray {
	public static void main(String[] args) {

		String[] array = new String[] { "a", "b", "c" };
		//List that is backed by an array which are immutable which can't be changed
		List<String> asList = Arrays.asList(array); // [a, b, c]
		List<String> of = List.of(array); // [a, b, c]
		List<String> copy = List.copyOf(asList); // [a, b, c]
		
		
		//Modification to base array changes the value of List as well as they are both objects pointing to same memory location.
		array[0] = "z";
		System.out.println(asList); // [z, b, c]
		System.out.println(of); // [a, b, c]
		System.out.println(copy); // [a, b, c]
		
		asList.set(0, "x");
		System.out.println(Arrays.toString(array)); // [x, b, c]
		//immutable so below will throw exception UnsupportedOperationException
		copy.add("y");
		LinkedList<String> ll = (LinkedList<String>) asList;
		ll.add("z"); //
		
	}
}
