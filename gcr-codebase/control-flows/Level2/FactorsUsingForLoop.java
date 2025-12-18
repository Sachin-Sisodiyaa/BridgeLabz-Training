/*Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.
*/

import java.util.Scanner;

//Program to find factorts of number using for loop
public class FactorsUsingForLoop
{
	public static void main(String[] args)
	{
		//Creating object of scanner and take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();

		//condition + loop for iteration and print result
		if(number > 0)
		{
			if(number == 1)
			{
				System.out.println(number);
			}

			for(int i=1; i<number; i++)
			{
				if(number % i == 0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("Please enter valid input");
		}
		input.close();
	}
}