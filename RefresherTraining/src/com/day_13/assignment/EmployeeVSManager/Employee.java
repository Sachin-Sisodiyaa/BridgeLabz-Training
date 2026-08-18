package com.day_13.assignment.EmployeeVSManager;

public class Employee {
	
	protected String name;
	protected double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	void getDetails() {
		System.out.println("Name: " + name + " Salary: " + salary);
	}
}
