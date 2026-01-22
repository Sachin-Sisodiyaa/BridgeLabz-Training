package com.dayeleven.digicontact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBookMain {

    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addContact(sc);
                    break;

                case 2:
                    editContact(sc);
                    break;

                case 3:
                    deleteContact(sc);
                    break;

                case 4:
                    searchContact(sc);
                    break;

                case 5:
                    displayContacts();
                    break;

                case 6:
                    System.out.println("Exiting Address Book...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add contact with duplicate validation
    private static void addContact(Scanner sc) {

        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(fn + " " + ln)) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }

        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();

        Address address = new Address(city, state, zip);
        contacts.add(new Contact(fn, ln, phone, email, address));

        System.out.println("Contact added successfully.");
    }

    private static void editContact(Scanner sc) {

        System.out.print("Enter Full Name to Edit: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {

                System.out.print("New Phone: ");
                String phone = sc.nextLine();
                System.out.print("New Email: ");
                String email = sc.nextLine();

                System.out.print("City: ");
                String city = sc.nextLine();
                System.out.print("State: ");
                String state = sc.nextLine();
                System.out.print("Zip: ");
                String zip = sc.nextLine();

                c.updateContact(phone, email, new Address(city, state, zip));
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    private static void deleteContact(Scanner sc) {

        System.out.print("Enter Full Name to Delete: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                contacts.remove(c);
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    private static void searchContact(Scanner sc) {

        System.out.print("Search by City or State: ");
        String key = sc.nextLine();

        boolean found = false;
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(key) ||
                c.getAddress().getState().equalsIgnoreCase(key)) {
                c.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contacts found.");
        }
    }

    private static void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        Collections.sort(contacts);
        for (Contact c : contacts) {
            c.display();
        }
    }
}

