/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/



import java.util.Scanner;

public class NumberCheckerThree {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        int index = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[index++] = digits[i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check Palindrome number using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number using digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	System.out.print("Enter number : ");
        int number = input.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.print("\nReversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }

        System.out.println("\nArrays Equal: " + compareArrays(digits, reversed));
        System.out.println("Palindrome Number: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));

	input.close();
    }
}
