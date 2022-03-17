package z.a_lambda;

import java.util.Random;
import java.util.function.Supplier;

import DTO.Employee;

public class G_SupplierFunctionalInterface {
	public static void main(String[] args) {
		Employee emp = new Employee("Amit Saha");
		Supplier<String> su = () -> Integer.toString(new Random().nextInt());
		emp.employeId = su.get();
		System.out.println(emp.employeId);
		
		
	}
	String func () {
		return Integer.toString(new Random().nextInt());
	}
}
