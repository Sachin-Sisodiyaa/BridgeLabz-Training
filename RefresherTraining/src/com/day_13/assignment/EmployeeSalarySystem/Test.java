package com.day_13.assignment.EmployeeSalarySystem;

public class Test {

	public static void main(String[] args) {
		SalaryCalculator c = new SalaryCalculator();
		
		c.calculateSalary(10000);
		c.calculateSalary(10000, 2000);
		c.calculateSalary(10000, 2000, 5000);
	}

}
