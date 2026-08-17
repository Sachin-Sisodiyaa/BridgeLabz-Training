package com.day_11.hackerrank;
import java.util.Scanner;

public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {

        int common = 0;

        while (common < s.length() &&
               common < t.length() &&
               s.charAt(common) == t.charAt(common)) {
            common++;
        }

        int operations = (s.length() - common) + (t.length() - common);

        if (operations <= k &&
            (k - operations) % 2 == 0) {
            return "Yes";
        }

        if (s.length() + t.length() <= k) {
            return "Yes";
        }

        return "No";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        System.out.print("Enter number of operations: ");
        int k = sc.nextInt();

        System.out.println(appendAndDelete(s, t, k));

        sc.close();
    }
}