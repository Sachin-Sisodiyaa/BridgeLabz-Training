/*Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use the isPrime boolean variable to store the result

*/


import java.util.Scanner;

//Program to find wheather a number is prime or not
public class CheckPrime
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = input.nextInt();
		boolean isPrime = true; 
		

		//logic --> loop and Conditions for checking prime
		for(int i=2; i<number; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		//Printing result
		if(isPrime)
		{
			System.out.println("The number :" + number + " is a Prime number");
		}
		else
		{
			System.out.println("The number :" + number + " is  Not a Prime number");
		}

		input.close();
	}
}
	