/*4. CallCenter – Customer Queue Manager (Queue + HashMap)
Story: In a telecom call center, customers are queued based on the time of call. Priority
customers have a special queue. A HashMap keeps track of the number of times each user has
called this month.
Requirements:

● Use Queue for managing incoming calls.
● Use HashMap for customer data.
● Priority Queue for VIP customers.*/






package com.daytwo.callcenter;

import java.util.Scanner;

public class CallCenterMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenter center = new CallCenter();
        int choice;

        do {
            System.out.println("\n--- Call Center Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Show Queues");
            System.out.println("4. Show Call History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    System.out.print("Priority (0=Normal, 1=VIP): ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    center.addCustomer(name, priority);
                    break;

                case 2:
                    center.serveNext();
                    break;

                case 3:
                    center.showQueues();
                    break;

                case 4:
                    center.showCallHistory();
                    break;

                case 5:
                    System.out.println("Exiting Call Center...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
