/*7. CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity*/




package com.dayfive.cinemahouse;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CinemaHouseMain {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);


        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();





        sc.nextLine();

        MovieTime[] movieTime = new MovieTime[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Show: " + (i + 1));

            System.out.print("Enter time (hh:mm AM/PM): ");
            String timeInput = sc.nextLine();

            LocalTime time = LocalTime.parse(timeInput, timeFormatter);

            movieTime[i] = new MovieTime(time);
        }

        BubbleSort.sort(movieTime);

        System.out.println("\nSorted Show Times: ");
        for(int i=0; i<movieTime.length; i++) {
        	System.out.println(movieTime[i] + " ");
        }
        sc.close();
    }
}
