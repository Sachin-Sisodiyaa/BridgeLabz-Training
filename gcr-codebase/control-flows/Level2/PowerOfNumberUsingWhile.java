/*Rewrite the above program to find the power of a number using a while loop.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
Finally, print the result
*/


import java.util.Scanner;

//Program to calculate power of a number using while loop
public class PowerOfNumberUsingWhile
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and taking inputs 
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		System.out.print("Enter Power : ");
		int power = input.nextInt();
		int result = 1, counter = 0;

		//condition + logic + loop
		if(number > 0)
		{
			while(counter != power)
			{
				result *= number;
				counter++;
			}
		}
		else
		{
			System.out.println("Invalid input");
		}

		//Print the final result
		System.out.println("The result is : " + result);
		
		input.close();
	}
} 	