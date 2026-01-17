/*
 1. IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons*/



package com.daysix.icecreamrush;

import java.util.Scanner;

public class IceCreamRushMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] flavours = {"Chocolate", "Orange", "Coffee", "Vanilla", "Blueberry", "Cherry", "Strawberry", "Banana"};
		
		int[] sold = new int[8];
		for(int i=0; i<8; i++) {
			System.out.print("Enter sold unit of " + flavours[i] + " flavour: ");
			sold[i] = sc.nextInt();
		}
		
		BubbleSort.sort(flavours, sold);
		
		System.out.println("\nSorted sales record of ice-cream flavours: ");
		
		for(int i=0; i<8; i++) {
			System.out.println("\n" + flavours[i] + " flavour -------> " + sold[i] + " unit sold");
		}
	}
}
