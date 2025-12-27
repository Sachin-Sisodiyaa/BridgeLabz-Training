package com.constructors.levelone;

public class ManagerMain {
	// Main method for testing
    public static void main(String[] args) {

        Manager m = new Manager(101, "IT", 60000);

        m.displayManagerDetails();

        // Modify salary using public method
        m.setSalary(75000);

        System.out.println("\nAfter Salary Update:");
        m.displayManagerDetails();
    }
}
