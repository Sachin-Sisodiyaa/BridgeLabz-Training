/*3. Power Calculation
Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or
conditionals). */

import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Base or num1");

            double base = sc.nextDouble();

            System.out.println("Enter expenent or power");
            
            double pow = sc.nextDouble();

            double power = Math.pow(base, pow);
            
            System.out.println("Power of provided number is = " + power);
        }
    }
}
