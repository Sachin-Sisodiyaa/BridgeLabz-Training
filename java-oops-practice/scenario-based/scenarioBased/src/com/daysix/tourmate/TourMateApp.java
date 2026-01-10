/*18. "TourMate – Travel Itinerary Planner"
Story: TourMate helps travelers plan and book trips by organizing activities, transportation, and
stays.
Requirements :

● Trip class: destination, budget, duration.
● Transport, Hotel, Activity are associated.
● Interface IBookable with book() and cancel() methods.
● Encapsulation: hide cost breakdown inside services.
● Use constructors to generate complete trip packages.
● Operators: total budget = hotel + transport + activities.
● Inheritance: InternationalTrip, DomesticTrip extend Trip.
● Polymorphism: book() logic differs based on trip type.*/





package com.daysix.tourmate;

import java.util.Scanner;

public class TourMateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Trip trip = null;

        System.out.println("Welcome to TourMate – Travel Itinerary Planner");
        System.out.println("-----------------------------------------------");

        System.out.println("Select Trip Type:");
        System.out.println("1. Domestic Trip");
        System.out.println("2. International Trip");
        System.out.print("Enter choice: ");
        int tripChoice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Trip Duration (days): ");
        int duration = sc.nextInt();

        // Transport
        System.out.print("Enter Transport Cost: ");
        double transportCost = sc.nextDouble();
        Transport transport = new Transport(transportCost);

        // Hotel
        System.out.print("Enter Hotel Cost per Day: ");
        double hotelCostPerDay = sc.nextDouble();
        Hotel hotel = new Hotel(hotelCostPerDay, duration);

        // Activity
        System.out.print("Enter Total Activity Cost: ");
        double activityCost = sc.nextDouble();
        Activity activity = new Activity(activityCost);

        // Polymorphic object creation
        switch (tripChoice) {
            case 1:
                trip = new DomesticTrip(
                        destination,
                        duration,
                        transport,
                        hotel,
                        activity
                );
                break;

            case 2:
                trip = new InternationalTrip(
                        destination,
                        duration,
                        transport,
                        hotel,
                        activity
                );
                break;

            default:
                System.out.println("Invalid trip type selected.");
                System.exit(0);
        }

        System.out.println("\nTrip Summary");
        System.out.println("----------------");
        trip.book();

        System.out.print("\nDo you want to cancel the trip? (yes/no): ");
        String cancelChoice = sc.next();

        if (cancelChoice.equalsIgnoreCase("yes")) {
            trip.cancel();
        } else {
            System.out.println("Trip confirmed! Have a great journey.");
        }

        sc.close();
    }
}
