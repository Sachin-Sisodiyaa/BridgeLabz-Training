/*9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting*/



package com.daynine.tailorshop;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class TailorShopMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);

        ArrayList<Order> orders = new ArrayList<>();

        System.out.println("=> Welcome to Tailor Shop");

        while (true) {
            System.out.println("\n1. Add new order");
            System.out.println("2. Show sorted orders");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Order ID: ");
                String orderId = sc.nextLine();

                System.out.print("Enter Deadline (dd/MM/yyyy): ");
                String dateInput = sc.nextLine();
                LocalDate deadLine = LocalDate.parse(dateInput, dateFormatter);

                orders.add(new Order(deadLine, orderId));

                InsertionSort.sort(orders, orders.size() - 1);

                System.out.println("Order added and sorted successfully.");

            } else if (choice == 2) {
                System.out.println("\nOrderId\t|\tDeadline");
                System.out.println("-----------------------------");
                for (Order o : orders) {
                    System.out.println(o);
                }

            } else if (choice == 0) {
                System.out.println("Exiting Tailor Shop...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
