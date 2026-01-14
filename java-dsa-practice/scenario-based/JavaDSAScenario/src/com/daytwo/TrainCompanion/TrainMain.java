/*5. TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.
*/








package com.daytwo.TrainCompanion;

import java.util.Scanner;

public class TrainMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Train train = new Train();
        int choice;

        do {
            System.out.println("\n--- Train Companion Menu ---");
            System.out.println("1. Add Compartment");
            System.out.println("2. Move Forward");
            System.out.println("3. Move Backward");
            System.out.println("4. Show Adjacent Compartments");
            System.out.println("5. Remove Current Compartment");
            System.out.println("6. Show Train");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter compartment name: ");
                    train.addCompartment(sc.nextLine());
                    break;

                case 2:
                    train.moveForward();
                    break;

                case 3:
                    train.moveBackward();
                    break;

                case 4:
                    train.showAdjacent();
                    break;

                case 5:
                    train.removeCurrent();
                    break;

                case 6:
                    train.showTrain();
                    break;

                case 7:
                    System.out.println("Exiting Train Companion...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}

