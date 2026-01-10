package com.dayseven.foodloop;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<FoodItem> cart = new ArrayList<>();

        System.out.println("Welcome to FoodLoop");
        System.out.println("---------------------");

        while (true) {
            System.out.println("\n1. Add Veg Item");
            System.out.println("2. Add Non-Veg Item");
            System.out.println("3. Place Order");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) break;

            System.out.print("Enter Food Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            FoodItem item;

            if (choice == 1) {
                item = new VegItem(name, price);
            } else if (choice == 2) {
                item = new NonVegItem(name, price);
            } else {
                System.out.println("Invalid choice!");
                continue;
            }

            if (item.isAvailable()) {
                item.reduceStock();
                cart.add(item);
                System.out.println("Item added to cart");
            } else {
                System.out.println("Item out of stock");
            }
        }

        Order order = new Order(cart);
        order.placeOrder();

        System.out.print("\nCancel order? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            order.cancelOrder();
        } else {
            System.out.println("Order confirmed. Enjoy!");
        }

        sc.close();
    }
}
