package com.constructors.levelone;

public class EBookMain {
	// Main method for testing
    public static void main(String[] args) {

        EBook ebook = new EBook("978-0135166307", "Java Programming", "James Gosling");

        ebook.displayBookDetails();

        // Modify author using setter
        ebook.setAuthor("Oracle Corporation");

        System.out.println("\nAfter Author Update:");
        ebook.displayBookDetails();
    }
}
