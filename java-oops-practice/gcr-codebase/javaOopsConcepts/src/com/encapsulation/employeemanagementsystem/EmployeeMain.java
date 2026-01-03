package com.encapsulation.employeemanagementsystem;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Rahul", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Anita", 80, 300);

        ((Department) emp1).assignDepartment("IT");
        ((Department) emp2).assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        // Polymorphism: Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department    : " +
                    ((Department) emp).getDepartmentDetails());
            System.out.println("--------------------------------");
        }
	}
}
