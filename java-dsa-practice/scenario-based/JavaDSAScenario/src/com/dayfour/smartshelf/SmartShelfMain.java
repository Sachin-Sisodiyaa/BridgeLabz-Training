/*2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title*/






package com.dayfour.smartshelf;

import java.util.Scanner;

public class SmartShelfMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of books: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String books[] = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter Book Name: ");
			books[i] = sc.nextLine();
		}
		
		InsertionSort.sort(books);
		
		System.out.println("Sorted Books");
		for(String b : books) {
			System.out.println(b);
		}
		sc.close();
	}
}
