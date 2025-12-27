package com.constructors.levelone;

public class CarRentalMain {
	// Main method for testing
    public static void main(String[] args) {

        // Using default constructor
        CarRental r1 = new CarRental();
        System.out.println("Default Rental:");
        r1.displayRental();

        System.out.println();

        // Using parameterized constructor
        CarRental r2 = new CarRental("Sachin", "SUV", 5, 2500);
        System.out.println("Parameterized Rental:");
        r2.displayRental();
    }
}
