package com.objectmodeling;

public class LibraryMain {
	public static void main(String[] args) {

	        // Independent Book objects
	        Book b1 = new Book("Java Programming", "James Gosling");
	        Book b2 = new Book("Python Basics", "Guido van Rossum");
	        Book b3 = new Book("Data Structures", "Mark Allen");

	        // Library objects
	        Library lib1 = new Library("City Library");
	        Library lib2 = new Library("College Library");

	        // Aggregation: Adding books to libraries
	        lib1.addBook(b1);
	        lib1.addBook(b2);

	        // same book in another library
	        lib2.addBook(b2);
	        
	        lib2.addBook(b3);

	        // Display libraries
	        lib1.displayLibraryBooks();
	        lib2.displayLibraryBooks();
	}
}
