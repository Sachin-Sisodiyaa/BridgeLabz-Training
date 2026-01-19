/* 2. Bag-n-Ball Organizer
 OOP Concepts:
Classes, Objects, Inheritance (optional), Encapsulation, Method Design
Scenario:
You’re building a toy storage system for TinyTown Play School, which wants to keep track of
bags and the balls inside them.
Each Bag has:
● A unique ID, color, and capacity (number of balls it can hold)
Each Ball has:
● A unique ID, color, and size (small/medium/large)

 Problem Statement:
Develop a Java system to:
● Add balls to a bag (up to capacity)
● Remove a ball from a bag
● Display all balls in a bag
● Display all bags and their ball count
● Prevent adding a ball if the bag is full

Encapsulate fields, use appropriate getters/setters, and model real-world object
relations through composition (i.e., Bag "has-a" list of Balls)
Bonus: Use an interface to define Storable behavior for both Bag and Ball.*/




package com.dayten.bagnball;

import java.util.ArrayList;
import java.util.Scanner;

public class BagBallMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bag> bags = new ArrayList<>();

        while (true) {
        	System.out.print("Choose option: ");
            System.out.println("\n1. Add Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display Balls in Bag");
            System.out.println("5. Display All Bags");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.nextLine();
                    System.out.print("Enter Bag Color: ");
                    String bagColor = sc.nextLine();
                    System.out.print("Enter Bag Capacity: ");
                    int capacity = sc.nextInt();
                    bags.add(new Bag(bagId, bagColor, capacity));
                    System.out.println("Bag added.");
                    break;

                case 2:
                    System.out.print("Enter Bag ID: ");
                    bagId = sc.nextLine();
                    Bag bag = findBag(bags, bagId);
                    if (bag != null) {
                        System.out.print("Enter Ball ID: ");
                        String ballId = sc.nextLine();
                        System.out.print("Enter Ball Color: ");
                        String ballColor = sc.nextLine();
                        System.out.print("Enter Ball Size: ");
                        String size = sc.nextLine();
                        bag.addBall(new Ball(ballId, ballColor, size));
                    } else {
                        System.out.println("Bag not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Bag ID: ");
                    bagId = sc.nextLine();
                    bag = findBag(bags, bagId);
                    if (bag != null) {
                        System.out.print("Enter Ball ID to remove: ");
                        String ballId = sc.nextLine();
                        bag.removeBall(ballId);
                    } else {
                        System.out.println("Bag not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Bag ID: ");
                    bagId = sc.nextLine();
                    bag = findBag(bags, bagId);
                    if (bag != null) {
                        bag.displayBalls();
                    } else {
                        System.out.println("Bag not found.");
                    }
                    break;

                case 5:
                    for (Bag b : bags) {
                        b.displayBagInfo();
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static Bag findBag(ArrayList<Bag> bags, String id) {
        for (Bag b : bags) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }
}

