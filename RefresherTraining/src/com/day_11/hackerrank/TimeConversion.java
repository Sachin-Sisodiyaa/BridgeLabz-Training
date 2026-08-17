package com.day_11.hackerrank;
import java.util.Scanner;

public class TimeConversion {

    public static String timeConversion(String s) {

        int hour = Integer.parseInt(s.substring(0, 2));
        String ampm = s.substring(8, 10);

        if (ampm.equals("AM") && hour == 12) {
            hour = 0;
        }

        if (ampm.equals("PM") && hour != 12) {
            hour = hour + 12;
        }

        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time: ");
        String s = sc.nextLine();

        System.out.println(timeConversion(s));

        sc.close();
    }
}