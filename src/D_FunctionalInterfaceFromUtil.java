import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class D_FunctionalInterfaceFromUtil {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("Jholu Boy", 19), new Student("Chaddu Baby", 1),
				new Student("Bhun Chun Boy", 35), new Student("Lolu", 13), new Student("Jholu", 56));
		//Here we are not even creating and interface since such interface with abstract implementation is provided by util.function we are directly using it 
		checkAdultStudent(studentList, stu -> stu.age > 18);

	}

	public static void checkAdultStudent(List<Student> stu, Predicate<Student> pre) {
		for (Student student : stu) {
			if (pre.test(student)) {
				System.out.println("This boy is adult +" + student.name);
			}
		}
	}
}

class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
