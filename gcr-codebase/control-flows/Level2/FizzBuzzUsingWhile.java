/*Rewrite the program 4 FizzBuzz using the while loop 


import java.util.Scanner;

//Program to check wheather number is fizz, buzz or fizzbuzz using while loop
public class FizzBuzzUsingWhile
{
	public static void main(String[] args)
	{
		//Creating scanner class object and take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int number = input.nextInt();

		//logic part and print result
		if(number < 3)
		{
			System.out.println("\nPlease enter a positive integer Greater than 3");
		}
		else
		{
			while(number >= 3)
			{
				if(number % 3 == 0 && number % 5 ==0)
				{
					System.out.println("\nThe number " + number + " is FizzBuzz");
				}
				if(number % 3 == 0)
				{
					System.out.println("\nThe number " + number + " is Fizz");
				}
				if(number % 5 == 0)
				{
					System.out.println("\nThe number " + number + " is Buzz");
				}
				number--;
			}
		}
		input.close();
	}
}


