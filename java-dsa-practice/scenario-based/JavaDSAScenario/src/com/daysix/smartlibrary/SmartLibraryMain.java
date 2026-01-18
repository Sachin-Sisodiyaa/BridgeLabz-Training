/* 2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data*/



package com.daysix.smartlibrary;

import java.util.Scanner;

public class SmartLibraryMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Books: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] books = new String[n];
		for(int i=0; i<books.length; i++) {
			System.out.print("\n" + (i+1) + ". Enter Book Name: ");
			books[i] = sc.nextLine();
			
			InsertionSort.sort(books, i);
		}
		
		System.out.println("\nSorted Books Name: ");
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i]);
		}
		sc.close();
	}
}
