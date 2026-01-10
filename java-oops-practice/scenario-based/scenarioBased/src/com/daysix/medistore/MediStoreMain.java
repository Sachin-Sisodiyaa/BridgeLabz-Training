package com.daysix.medistore;

import java.time.LocalDate;

import java.util.Scanner;

public class MediStoreMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Medicine medicine = null;

        System.out.println("Welcome to MediStore – Pharmacy System");
        System.out.println("---------------------------------------");

        System.out.println("Select Medicine Type:");
        System.out.println("1. Tablet");
        System.out.println("2. Syrup");
        System.out.println("3. Injection");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price per unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String dateInput = sc.next();
        LocalDate expiryDate = LocalDate.parse(dateInput);

        // Create object based on user choice
        switch (choice) {
            case 1:
                medicine = new Tablet(name, price, expiryDate);
                break;
            case 2:
                medicine = new Syrup(name, price, expiryDate);
                break;
            case 3:
                medicine = new Injection(name, price, expiryDate);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.print("Enter quantity to sell: ");
        int qty = sc.nextInt();

        System.out.println("\nProcessing Sale...\n");
        medicine.sell(qty);

        sc.close();
    }
}
