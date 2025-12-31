package com.objectmodeling;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Create employees INSIDE department (composition)
    public void addEmployee(int empId, String empName) {
        employees.add(new Employee(empId, empName));
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
            System.out.println();
        }
    }
}
