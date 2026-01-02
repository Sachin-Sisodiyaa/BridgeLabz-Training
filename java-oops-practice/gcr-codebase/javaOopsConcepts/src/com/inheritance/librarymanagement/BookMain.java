package com.inheritance.librarymanagement;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert Java developer and author"
        );

        book.displayInfo();
    }
}

