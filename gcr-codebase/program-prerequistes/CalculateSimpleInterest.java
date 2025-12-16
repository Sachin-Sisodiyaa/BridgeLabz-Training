/*Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user. */

import java.util.Scanner;
public class CalculateSimpleInterest {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter principle amount");

            double principle = sc.nextDouble();

            System.out.println("Enter principle rate");

            double rate = sc.nextDouble();

            System.out.println("Enter principle time");

            double time = sc.nextDouble();

            double interest = (principle * rate * time) / 100;

            System.out.println("Simple Interest for given values = " + interest);

        }
    }
}
