package com.dayfour.eventease;

import java.util.Scanner;

public class EventEaseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Organizer Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Organizer Email: ");
        String email = sc.nextLine();

        User organizer = new User(userName, email);

        System.out.println("\nChoose Event Type:");
        System.out.println("1. Birthday");
        System.out.println("2. Conference");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Catering required? (true/false): ");
        boolean catering = sc.nextBoolean();

        System.out.print("Decoration required? (true/false): ");
        boolean decoration = sc.nextBoolean();

        Event event;

        if (choice == 1) {
            event = new BirthdayEvent(eventName, location, date, attendees, catering, decoration);
        } else {
            event = new ConferenceEvent(eventName, location, date, attendees, catering, decoration);
        }

        System.out.println("\nEvent Scheduled by: " + organizer.getName());
        event.schedule();

        System.out.println("\nEvent Details:");
        event.displayEventDetails();
    }
}
