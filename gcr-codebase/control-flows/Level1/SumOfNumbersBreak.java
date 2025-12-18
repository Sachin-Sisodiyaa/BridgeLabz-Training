/* Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
*/


import java.util.Scanner;

//program to find sum of numbers greater than zero
public class SumOfNumberBreak
{
	public static void main(String[] args)
	{
		//Declare and initialise Variables
		double number, sum = 0.0;

		//Creating object for scanner class and taking inputs
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a numter : ");
		number = input.nextDouble();
	
		//Conditional loop and printing output
		while(true)
		{
			if(number <= 0)
				break;
			else
				sum += number;
				System.out.print("\nEnter a numter again : ");
				number = input.nextDouble();
				
			
		}
		
		//Print output
		System.out.print("\nTotal value is " + sum);

		//closing scanner
		input.close();
	}
}
