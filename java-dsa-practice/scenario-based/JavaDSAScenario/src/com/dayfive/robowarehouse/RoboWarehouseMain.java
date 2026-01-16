/*6. RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions*/




package com.dayfive.robowarehouse;

import java.util.Scanner;

public class RoboWarehouseMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Package: ");
		int p = sc.nextInt();
		
		float weights[] = new float[p];
		for(int i=0; i<p; i++) {
			System.out.print("Enter the weight of pakage in kg: " + (i + 1) + " : ");
			weights[i] = sc.nextFloat();
			
			InsertionSort.sort(weights, i);
		}
		
		

		System.out.println("\nSorted packages on shelves: ");
		for(int i=0; i<p; i++) {
			System.out.print(weights[i] + " kg," + " ");
		}
		
		sc.close();
	}
}
