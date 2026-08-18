package com.day_12.assignment;

public class LibraryBookTracker {
	String title;
	String author;
	int isBn;
	
	static int totalBooksInLibrary;
	static int totalBooksCheckedOut;
	
	public LibraryBookTracker(String title, String author, int isBn) {
		this.title = title;
		this.author = author;
		this.isBn = isBn;
		
		totalBooksInLibrary++;
	}
	
	public void checkOut() {
		totalBooksCheckedOut++;
	}
	
	public void returnBook() {
		totalBooksCheckedOut--;
	}
	
	public static void main(String args[]) {
		LibraryBookTracker b1 = new LibraryBookTracker("NCRT", "RD Sharma", 1);
		LibraryBookTracker b2 = new LibraryBookTracker("Maths", "S Pathak", 2);
		LibraryBookTracker b3 = new LibraryBookTracker("Chemistry", "A Pal", 3);
		LibraryBookTracker b4 = new LibraryBookTracker("Physics", "Y Sahu", 4);
		LibraryBookTracker b5 = new LibraryBookTracker("Biology", "H Gaur", 5);
		
		b3.checkOut();
		b1.checkOut();
		b2.checkOut();
		
		b3.returnBook();
		
		System.out.println(LibraryBookTracker.totalBooksInLibrary);
		System.out.println(LibraryBookTracker.totalBooksCheckedOut);

	}
	
	
}
