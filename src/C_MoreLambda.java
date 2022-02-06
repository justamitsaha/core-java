import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C_MoreLambda {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Rolu", "Ram", 9), new Person("Bholu", "Ram", 3),
				new Person("Chilka", "Ram", 22), new Person("Jholu", "Boy", 23), new Person("Felu", "Boy", 23));

		// Sort based on First Name
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.firstNmame.compareTo(o2.firstNmame);
			}
		});

		// print based on a condition this condition is a behavior passed as an in line implementation of an interface
		printOnCondition(personList, new Condition() {
			// check if age is odd or not
			@Override
			public boolean checkCondition(Person p) {
				return p.age % 2 == 0 ? false : true;
			}
		});

		// comparator is an interface with one method so a Functional interface so we can implement as a Lambda
		Collections.sort(personList, (p1, p2) -> p1.firstNmame.compareTo(p2.firstNmame));
		// lambda implementation of Condition
		printOnCondition(personList, p -> p.age % 2 == 0 ? false : true);

	}

	private static void printOnCondition(List<Person> list, Condition condition) {
		for (Person person : list) {
			if (condition.checkCondition(person)) {
				System.out.println("Name --> " + person.firstNmame + " " + person.lastName + " Age " + person.age);
			}
		}
	}
}

class Person {
	String firstNmame;
	String lastName;
	int age;

	Person(String fNmame, String lNmame, int age) {
		this.firstNmame = fNmame;
		this.lastName = lNmame;
		this.age = age;
	}
}

@FunctionalInterface
interface Condition {
	boolean checkCondition(Person p);
}