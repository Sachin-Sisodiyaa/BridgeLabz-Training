package com.day_11.hackerrank;
import java.util.Scanner;

public class BeautifulDays {

    public static int beautifulDays(int i, int j, int k) {

        int count = 0;

        for (int day = i; day <= j; day++) {

            int num = day;
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if (Math.abs(day - reverse) % k == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter i, j and k: ");

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(beautifulDays(i, j, k));

        sc.close();
    }
}