/*4. Calculate Average of Three Numbers
Write a program that takes three numbers as input from the user and prints
their average. */

import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter num1");

            double num1 = sc.nextDouble();

            System.out.println("Enter num2");

            double num2 = sc.nextDouble();

            System.out.println("Enter num3");

            double num3 = sc.nextDouble();
            
            double average = (num1 + num2 + num3) / 3;

            System.out.println("Average of three numbers = " + average);
        }
    }
}
