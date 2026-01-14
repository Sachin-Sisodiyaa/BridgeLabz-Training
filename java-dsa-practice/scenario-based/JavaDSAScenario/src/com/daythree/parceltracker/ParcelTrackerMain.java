/*10. ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).*/



package com.daythree.parceltracker;

import java.util.Scanner;

public class ParcelTrackerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stages tracker = new Stages();

        int choice;

        do {
            System.out.println("\n===== Parcel Tracker Menu =====");
            System.out.println("1. Add Delivery Stage");
            System.out.println("2. Add Checkpoint at Specific Position");
            System.out.println("3. Show Parcel Tracking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter stage name: ");
                    String stage = sc.nextLine();
                    tracker.addStage(stage);
                    System.out.println("✅ Stage added successfully.");
                    break;

                case 2:
                    System.out.print("Enter checkpoint name: ");
                    String checkpoint = sc.nextLine();

                    System.out.print("Enter position to insert checkpoint: ");
                    int position = sc.nextInt();
                    sc.nextLine();

                    tracker.addCheckpoint(checkpoint, position);
                    System.out.println("Checkpoint added successfully.");
                    break;

                case 3:
                    System.out.println("\nParcel Delivery Status:");
                    tracker.showTrack();
                    break;

                case 4:
                    System.out.println("Exiting Parcel Tracker...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
