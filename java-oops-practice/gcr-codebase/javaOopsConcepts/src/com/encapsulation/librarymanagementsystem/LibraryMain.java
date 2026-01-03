package com.encapsulation.librarymanagementsystem;

import java.util.ArrayList;

public class LibraryMain {

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem i1 = new Book(1, "Java Programming", "James Gosling");
        LibraryItem i2 = new Magazine(2, "Tech Monthly", "Editorial Team");
        LibraryItem i3 = new DVD(3, "OOP Concepts", "Tech Studio");

        items.add(i1);
        items.add(i2);
        items.add(i3);

        // Polymorphism in action
        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available     : " + r.checkAvailability());
                r.reserveItem("Sachin");
            }

            System.out.println("--------------------------------");
        }
    }
}

