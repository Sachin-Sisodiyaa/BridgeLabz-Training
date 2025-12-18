/*Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
*/


import java.util.Scanner;

//Program to find factorial using for loop
public class FactorialForLoop
{
	public static void main(String[] args)
	{
		//Declare variable
		int number;
		long factorial = 1;

		//Creating object for scanner class and take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		number = input.nextInt();

		//Checking number and calculating factorial
		if(number > 0)
		{
			for(int counter=1; counter<=number; counter++)
			{
				factorial *= counter;
			}
		}
		else
		{
			System.out.println("Negative input value");
		}

		//Print result
		System.out.println("\nFactorial of number : " + number + " is " + factorial);

		//close scanner
		input.close();
	}
}
