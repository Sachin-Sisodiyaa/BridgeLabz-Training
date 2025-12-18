/* Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/


import java.util.Scanner;

//Program to check number is divisible by five or not
public class NumberDivisibleByFive
{	public static void main(String[] args)
	{
		//Crete variable to store input number
		int number;

		//Creating an object for Scanner class
		Scanner input = new Scanner(System.in);

		//Take input
		System.out.print("\nEnter Number : ");
		number = input.nextInt();

		//Condition to check and print output
		System.out.println("Is the number " + number + " divisible by 5? : " + (number % 5 == 0));
		input.close();
	}
}
