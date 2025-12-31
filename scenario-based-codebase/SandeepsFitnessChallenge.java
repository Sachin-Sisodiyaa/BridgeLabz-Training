/*13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.Scanner;

public class SandeepsFitnessChallenge {
	public static void main(String[] args) {
		//Variable declaration and taking inputs
		Scanner sc = new Scanner(System.in);
		int total = 0, count = 0;
		int days[] = new int[7];

		for(int i=0; i<7; i++){
			System.out.println("Enter the push-ups of day: " + (i + 1));
			days[i] = sc.nextInt();
		}

		//loop and condition to count total and average of push-ups
		for(int day : days){
			if(day == 0)
				continue;
			else
				count++;
				total += day;
		}
		int average = total / count;

		//Printing results
		System.out.println("Total number of push-ups: " + total);
		System.out.println("Average push-ups per day: " + average);

		sc.close();
	}
}
		

		