/*Scenario:
You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.*/





package com.dayten.geomeasuresolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> comparisonHistory = new ArrayList<>();

        System.out.print("Enter number of line comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nComparison " + i);

            System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
            LineSegment line1 = new LineSegment(
                    sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble(), sc.nextDouble()
            );

            System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
            LineSegment line2 = new LineSegment(
                    sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble(), sc.nextDouble()
            );

            double length1 = line1.calculateLength();
            double length2 = line2.calculateLength();

            System.out.println("\nLength of Line 1: " + length1);
            System.out.println("\nLength of Line 2: " + length2);

            String result;
            if (length1 == length2) {
                result = "Both lines are equal in length.";
            } else if (length1 > length2) {
                result = "Line 1 is longer than Line 2.";
            } else {
                result = "Line 2 is longer than Line 1.";
            }

            System.out.println(result);
            comparisonHistory.add(result);
        }

        System.out.println("\n--- Comparison Summary ---");
        for (String res : comparisonHistory) {
            System.out.println("\n" + res);
        }

        sc.close();
    }
}
