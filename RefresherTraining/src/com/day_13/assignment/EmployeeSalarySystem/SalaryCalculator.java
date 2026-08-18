package com.day_13.assignment.EmployeeSalarySystem;

public class SalaryCalculator {
	
	void calculateSalary(double salary) {
		System.out.println("Salary: " + salary);
	}
	
	void calculateSalary(double salary, double bonus) {
		System.out.println("Salary + Bonus: " + (salary+bonus));
	}

	void calculateSalary(double salary, double bonus, double deduction) {
		System.out.println("Salary + Bonus - Deduction: " + (salary+bonus-deduction));
	}
}
