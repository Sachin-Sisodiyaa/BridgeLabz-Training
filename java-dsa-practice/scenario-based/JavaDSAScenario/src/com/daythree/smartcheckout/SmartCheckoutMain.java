/*9. SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.*/



package com.daythree.smartcheckout;

import java.util.Scanner;

public class SmartCheckoutMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();
        int choice;

        // Preloaded items
        checkout.addItemToInventory("Milk", 50, 20);
        checkout.addItemToInventory("Bread", 30, 15);
        checkout.addItemToInventory("Eggs", 10, 50);

        do {
            System.out.println("\n===== Smart Checkout Menu =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Checkout");
            System.out.println("3. Show Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    Customer customer = new Customer(sc.nextLine());

                    System.out.print("Enter number of items: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Item name: ");
                        String itemName = sc.nextLine();

                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();
                        sc.nextLine();

                        customer.addItem(itemName, qty);
                    }

                    checkout.addCustomer(customer);
                    break;

                case 2:
                    checkout.processCheckout();
                    break;

                case 3:
                    checkout.showInventory();
                    break;

                case 4:
                    System.out.println("Exiting Smart Checkout...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
