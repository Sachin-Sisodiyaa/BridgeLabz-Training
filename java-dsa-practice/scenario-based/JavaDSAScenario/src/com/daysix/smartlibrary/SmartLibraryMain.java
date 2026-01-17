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
