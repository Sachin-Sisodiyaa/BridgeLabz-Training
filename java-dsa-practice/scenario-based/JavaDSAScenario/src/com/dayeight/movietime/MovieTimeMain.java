/*6. MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming showtimes. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering*/




package com.dayeight.movietime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MovieTimeMain {
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
            
            InsertionSort.sort(movieTime, i);
        }

        

        System.out.println("\nSorted Show Times: ");
        for(int i=0; i<movieTime.length; i++) {
        	System.out.println(movieTime[i] + " ");
        }
        sc.close();
    }
}
