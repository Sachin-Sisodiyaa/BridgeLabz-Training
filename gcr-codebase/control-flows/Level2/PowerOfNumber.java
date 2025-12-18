/*Create a program to find the power of a number.
Hint => 
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
*/


import java.util.Scanner;

//Program to calculate power of a number using for loop
public class PowerOfNumber
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and taking inputs 
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		System.out.print("Enter Power : ");
		int power = input.nextInt();
		int result = 1;

		//condition + logic + loop
		if(number > 0)
		{
			for(int i=1; i<=power; i++)
			{
				result *= number;
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