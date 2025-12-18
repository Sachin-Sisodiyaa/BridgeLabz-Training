/* Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
*/



import java.util.Scanner;

//Program to find factorial
public class Factorial
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
		int counter = number;

		//Checking number and calculating factorial
		if(counter > 0)
		{
			while(counter > 0)
			{
				factorial *= counter;
				counter--;
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

				