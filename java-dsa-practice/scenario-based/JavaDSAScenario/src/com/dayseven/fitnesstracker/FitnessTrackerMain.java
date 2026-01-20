/* 5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting*/





package com.dayseven.fitnesstracker;

import java.util.Scanner;

public class FitnessTrackerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to FitnessTracker's StepCount LeaderBoard");
		
		System.out.print("\nEnter number of persons/users: ");
		int n = sc.nextInt();
		
		int stepsCount[][] = new int [n][2];
		for(int i=0; i<n; i++) {
			stepsCount[i][0] = i;
			System.out.print("Enter Step Count of Person " + (i+1) + " : ");
			stepsCount[i][1] = sc.nextInt();
		}
		
		BubbleSort.sort(stepsCount);
		
		for(int i=0; i<n; i++) {
			System.out.println("\nPerson " + (stepsCount[i][0] + 1) +" ----> Steps: " + stepsCount[i][1]);
		}
		
		sc.close();
	}

}
