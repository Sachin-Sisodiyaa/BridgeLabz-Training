/*2. Add Two Numbers
Write a program that takes two numbers as input from the user and prints
their sum.*/

import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter first number");

            int num1 = sc.nextInt();

            System.out.println("Enter second number");

            int num2 = sc.nextInt();

            int sum = num1 + num2;

            System.out.println("Sum of num1 and num2 = " + sum);
        }
    }
}
