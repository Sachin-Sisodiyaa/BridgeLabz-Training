/*2. Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer

Scenario-based Problems
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
● OOP:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters*/




package com.dayone.vehiclerentalapplication;

import java.util.Scanner;

public class VehicleRentalMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking customer input
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        Customer customer = new Customer(customerName);

        // Vehicle selection
        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Truck");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        Vehicle vehicle = null;

        // Creating object based on user choice
        switch (choice) {
            case 1:
                vehicle = new Bike(vehicleNumber);
                break;
            case 2:
                vehicle = new Car(vehicleNumber);
                break;
            case 3:
                vehicle = new Truck(vehicleNumber);
                break;
            default:
                System.out.println("Invalid vehicle choice!");
                return;
        }

        // Renting vehicle (Polymorphism in action)
        customer.rentVehicle(vehicle, days);

        sc.close();
    }
}

