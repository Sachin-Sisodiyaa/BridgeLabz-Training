package com.constructors.levelone;

public class LibrarySystemMain {
	// Main method for testing
    public static void main(String[] args) {

    	LibrarySystem b1 = new LibrarySystem("Java Programming", "James Gosling", 499.99);

        b1.displayBook();
        System.out.println();

        b1.borrowBook();   // borrow first time
        b1.borrowBook();   // try borrowing again
    }
}
