/*5. Palindrome Checker:
○ Write a program that checks if a given string is a palindrome (a word, phrase, or
sequence that reads the same backward as forward).
○ Break the program into functions for input, checking the palindrome condition,
and displaying the result.*/



import java.util.Scanner;

public class CheckPalindrome {

    //Method to  check palindrome
    public static boolean isPalindrome(String text) {
        String reverse = new StringBuilder(text).reverse().toString();
        return text.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println(isPalindrome(text) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
