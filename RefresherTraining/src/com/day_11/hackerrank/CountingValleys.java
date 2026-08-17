package com.day_11.hackerrank;
import java.util.Scanner;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        int level = 0;
        int valleys = 0;

        for (int i = 0; i < steps; i++) {

            if (path.charAt(i) == 'U') {
                level++;
            } else {
                level--;
            }

            if (level == 0 && path.charAt(i) == 'U') {
                valleys++;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter steps: ");
        int steps = sc.nextInt();

        System.out.print("Enter path: ");
        String path = sc.next();

        System.out.println(countingValleys(steps, path));

        sc.close();
    }
}