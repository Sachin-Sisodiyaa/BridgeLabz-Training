/*4. EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets*/



package com.dayfour.eventmanager;

import java.util.Scanner;

public class EventManagerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of tickets of an event : ");
		int t = sc.nextInt();
		
		float prices[] = new float[t];
		for(int i=0; i<t; i++) {
			System.out.print("Enter price of " + (i + 1) + " ticket: ");
			prices[i] = sc.nextFloat();
		}
		
		QuickSort.sort(prices, 0, prices.length-1);
		
		System.out.println("\nTop 5 most cheapest tickets (Rs): ");
		for(int i=0; i<5; i++) {
			System.out.print(prices[i] + "	");
		}
		
		System.out.println("\nTop 5 most Expensive tickets(Rs): ");
		for(int i=prices.length-1; i>=prices.length-5; i--) {
			System.out.print(prices[i] + "	");
		}
	}
}
