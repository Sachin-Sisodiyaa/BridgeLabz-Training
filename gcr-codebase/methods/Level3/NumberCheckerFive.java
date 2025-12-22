/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is an abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/


import java.util.Scanner;

public class NumberCheckerFive {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfectNumber(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundantNumber(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficientNumber(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	System.out.print("Enter number : ");
        int number = input.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));

	input.close();
    }
}
