/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/

import java.util.Scanner;

public class NaturalNumbersSum {

    // Method using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
	//taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int recursiveSum = NaturalNumbersSum.sumUsingRecursion(n);
        int formulaSum = NaturalNumbersSum.sumUsingFormula(n);

        System.out.println("\nSum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        //results comparasion
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct");
        } else {
            System.out.println("Computations do not match");
        }

        sc.close();
    }
}
