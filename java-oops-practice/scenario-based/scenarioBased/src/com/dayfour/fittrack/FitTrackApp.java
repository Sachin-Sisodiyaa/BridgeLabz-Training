package com.dayfour.fittrack;

import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Fitness Goal: ");
        String goal = sc.nextLine();

        UserProfile user = new UserProfile(name, age, weight, goal);

        System.out.print("\nEnter Target Calories for Today: ");
        double targetCalories = sc.nextDouble();

        System.out.print("\nChoose Workout (1.Cardio  2.Strength): ");
        int choice = sc.nextInt();

        System.out.print("Enter Duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        if (choice == 1)
            workout = new CardioWorkout(duration);
        else
            workout = new StrengthWorkout(duration);

        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        double burned = workout.getCaloriesBurned();
        double remaining = targetCalories - burned;

        System.out.println("\nCalories Burned: " + burned);

        if (remaining > 0) {
            System.out.println("You need " + remaining + " more calories to reach your target.");
        } else if (remaining == 0) {
            System.out.println("Target achieved exactly!");
        } else {
            System.out.println("Target exceeded by " + Math.abs(remaining) + " calories!");
        }
    }
}

