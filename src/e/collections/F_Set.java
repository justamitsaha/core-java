package e.collections;

import java.util.HashSet;
import java.util.Set;

import DTO.Animal;

//You use a set when you don't want to allow duplicate entries
public class F_Set {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// A HashSet stores its elements in a hash table,  where Key is generated using hashCode() method. Hash set uses equals() method is used to check duplicates and hashCode() method is used to 
		//retrieve the elements. The best case is that hash codes are unique, and Java has to call equals() on only one object. The worst case is that all implementations return the same hashCode(), 
		//and Java has to call equals() on every element of the set anyway.
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66); // true
		boolean b2 = set.add(66); // false since already present
		Integer i1 = 6;
		Integer i2 = 6;
		set.add(i1);
		set.add(i2);
		set.forEach(System.out::println);
		
		Set<String> hs = new HashSet<>();
		String s1 = "hello",s2= "hello";
		hs.add(new String());
		hs.add(s1);
		boolean b3=hs.add(s2);
		System.out.println(b3);
		hs.forEach(System.out::println);
		
		Set<Animal> set2 = new HashSet<>();
		set2.add(new Animal("snake", false, true));
		set2.add(new Animal("snake", false, true));
		System.out.println(set2);
	}
}
