/*9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering*/



package com.daysix.artexpo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ArtExpoMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);
		
		System.out.print("Enter number of registrations: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		RegistrationData[] data = new RegistrationData[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.print((i + 1) + ". Enter Artist Name: ");
            String name= sc.nextLine();
			
			System.out.print(" Registration Time (HH:MM AM/PM): ");
            String timeInput = sc.nextLine();   

            LocalTime time = LocalTime.parse(timeInput.toUpperCase(), formatter);

            data[i] = new RegistrationData(time, name);
		}
		
		InsertionSort.sort(data);
		
		System.out.println("\nSorted Registration Data by Time:");
        for(int i=0; i<n; i++) {
        	System.out.println(data[i].name + "  →  " + data[i].time);
        }

        sc.close();
	}
}
