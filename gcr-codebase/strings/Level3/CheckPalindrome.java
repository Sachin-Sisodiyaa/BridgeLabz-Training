/*Write a program to to check if a text is palindrome and display the result
Hint => 
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check 
Finally, in the main method do palindrome check using the three logic and display result
*/




import java.util.Scanner;

public class CheckPalindrome {

    // Checking palindrome using start and end index comparison
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Checking palindrome recursive method
    public static boolean isPalindromeLogic2(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reverse = new char[length];

        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    //Checking palindrome using character arrays
    public static boolean isPalindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeLogic1(input);
        boolean result2 = isPalindromeLogic2(input, 0, input.length() - 1);
        boolean result3 = isPalindromeLogic3(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------");
        System.out.println("Logic 1 (Loop Method): " + result1);
        System.out.println("Logic 2 (Recursive Method): " + result2);
        System.out.println("Logic 3 (Array & Reverse): " + result3);

        sc.close();
    }
}
