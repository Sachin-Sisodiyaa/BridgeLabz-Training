package com.encapsulation.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3; // days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

