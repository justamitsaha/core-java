package z.a_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import DTO.Student;

public class F_ComparatorFunctionalInterface {
	public static void main(String[] args) {
		List<Student> al = Arrays.asList(
				new Student(101, "Vijay", 23), 
				new Student(106, "Ajay", 55), 
				new Student(105, "Jai", 21), 
				new Student(108, "Sujai", 21), 
				new Student(107, "Jaijai", 41));

		System.out.println("Sorting by Name");
		Collections.sort(al, (s1, s2) -> {
			return s1.name.compareTo(s2.name);
		});

		for (Student s : al) {
			System.out.println(s.toString());
		}

		System.out.println("Sorting by age");
		Collections.sort(al, (s1, s2) -> {
			return s1.age == s2.age ? 0 : (s1.age > s2.age ? 1 : -1);
		});

		for (Student s : al) {
			System.out.println(s.toString());
		}
	}
}
