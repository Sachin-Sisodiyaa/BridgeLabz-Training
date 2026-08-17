package com.day_11.classwork;
import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkPalindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (checkPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}