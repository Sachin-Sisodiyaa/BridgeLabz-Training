package com.constructors.levelone;

public class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);   
        System.out.println("Department  : " + department);   
        System.out.println("Salary      : ₹" + getSalary()); 
    }
}
