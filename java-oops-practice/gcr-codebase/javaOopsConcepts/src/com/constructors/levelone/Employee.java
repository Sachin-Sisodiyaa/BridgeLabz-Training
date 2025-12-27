package com.constructors.levelone;

public class Employee {

    public int employeeID;          
    protected String department;    
    private double salary;          

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
