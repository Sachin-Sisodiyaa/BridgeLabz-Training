/* Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/


import java.util.Scanner;

//Program to check first number is smallest or not
public class FirstNumberSmallest
{
	public static void main(String [] args)
	{
		//Variable declaration
		int number1, number2, number3;
		
		//creating object of Scanner class
		Scanner input = new Scanner(System.in);

		//Taking inputs
		System.out.print("\nEnter number1 : ");
		number1 = input.nextInt();
		System.out.print("\nEnter number2 : ");
		number2 = input.nextInt();
		System.out.println("\nEnter number3 : ");
		number3 = input.nextInt();

		//checking and printing the output
		System.out.println("Is the first number the smallest? : " + (number1 < number2 &&number1 < number3));
		input.close();
	}
}
