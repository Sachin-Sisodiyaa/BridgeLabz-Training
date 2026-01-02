package com.inheritance.employeemanagementsystem;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1 = new Manager(101, "Sachin", 80000, 10);
        Employee e2 = new Developer(102, "Amit", 60000, "Java");
        Employee e3 = new Intern(103, "Ravi", 15000, 6);

        e1.displayDetails();
        System.out.println("------------");

        e2.displayDetails();
        System.out.println("------------");

        e3.displayDetails();
    }
}

