package com.constructors.levelone;

public class LibrarySystem {

    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public LibrarySystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // book is available by default
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}
