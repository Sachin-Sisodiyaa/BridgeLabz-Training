/*
1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records*/





package com.dayfour.hospitalqueue;

import java.util.Scanner;

public class HospitalQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of patients: ");
		int n = sc.nextInt();
		
		int patientNo[] = new int[n];//patient
		int criticality[] = new int[n];
		for(int i=0; i<n; i++) {
			patientNo[i] = i + 1;
			System.out.print("Enter Criticality level of Patient " + (i + 1) + ": ");
			criticality[i] = sc.nextInt();
		}
		
		BubbleSort.sort(patientNo, criticality);
		
		System.out.println("Sorted Patients based on criticality level");
		for(int i=0; i<n; i++) {
			System.out.println("Patient " + patientNo[i] + " → " + criticality[i]);
		}
		sc.close();
	}
}
