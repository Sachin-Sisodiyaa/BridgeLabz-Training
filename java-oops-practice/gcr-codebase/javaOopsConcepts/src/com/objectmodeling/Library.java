package com.objectmodeling;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;   // Aggregation

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display library books
    public void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }
    }
}
