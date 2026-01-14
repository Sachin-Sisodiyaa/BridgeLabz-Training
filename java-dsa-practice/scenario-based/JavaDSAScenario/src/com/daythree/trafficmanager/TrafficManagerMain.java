package com.daythree.trafficmanager;

import java.util.Scanner;

public class TrafficManagerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roundabout roundabout = new Roundabout();
        int choice;

        do {
            System.out.println("\n--- Traffic Manager Menu ---");
            System.out.println("1. Vehicle enters roundabout");
            System.out.println("2. Vehicle exits roundabout");
            System.out.println("3. Add vehicle to waiting queue");
            System.out.println("4. Process waiting queue");
            System.out.println("5. Show roundabout");
            System.out.println("6. Show waiting queue");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number plate: ");
                    roundabout.enterRoundabout(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter vehicle number plate to exit: ");
                    roundabout.exitRoundabout(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter vehicle number plate to add to waiting queue: ");
                    roundabout.addToQueue(sc.nextLine());
                    break;
                case 4:
                    roundabout.processQueue();
                    break;
                case 5:
                    roundabout.showRoundabout();
                    break;
                case 6:
                    roundabout.showQueue();
                    break;
                case 7:
                    System.out.println("Exiting Traffic Manager...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
