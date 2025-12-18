/*Rewrite the above program 7 to find the factors of a number using the while loop
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
*/


import java.util.Scanner;

//Program to find factors of number using while loop
public class FactorUsingWhileLoop
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and taking inputs
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int number = input.nextInt();
		int counter = 1;
		
		//Condition + loop For evaluating and print result
		if(number > 0)
		{
			if(number == 1)
			{
				System.out.println(number);
			}

			while(counter < number)
			{
				if(number % counter == 0)
				{
					System.out.println(counter);
				}
				counter++;
			}
		}
		else
		{
			System.out.println("Please provide valid input");
		}
		input.close();
	}
}