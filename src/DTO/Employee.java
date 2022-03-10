package DTO;

public class Employee {
	public String name;
	public String employeId;
	public Employee(String name, String employeId) {
		this.name = name;
		this.employeId = employeId;
	}
	
	public Employee(String name) {
		this.name = name;
	}
}
