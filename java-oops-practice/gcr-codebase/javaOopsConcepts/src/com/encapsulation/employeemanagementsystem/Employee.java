package com.encapsulation.employeemanagementsystem;

public abstract class Employee {
	private int employeeId;
	private String name;
	private double baseSalary;
	
	abstract double calculateSalary();
	
	// Constructor
	public Employee(int employeeId, String name, double baseSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	// Getters and Setters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
	
	public void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee name: " + name);
		System.out.println("Base Salary: " + calculateSalary());
	}
}
