package javaUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import DTO.Student;
public class CustomComparator {

	public static void main(String[] args) {
		List<Student> al = Arrays.asList(
				new Student(101, "Vijay", 23), 
				new Student(106, "Ajay", 55),
				new Student(105, "Jai", 21),
				new Student(105, "Aaa", 41));
		
		System.out.println("Sorting by Name");
		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}

class NameComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}

class AgeComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}
