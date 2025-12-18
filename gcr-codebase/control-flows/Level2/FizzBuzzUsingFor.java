/*Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Take the user input number, check for a positive integer, and use for loop to display*/



import java.util.Scanner;

//Program to check wheather number is fizz, buzz or fizzbuzz using for loop
public class FizzBuzzUsingFor
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
			for(int check=3; check<=number; check++)
			{
				if(check % 3 == 0)
				{
					System.out.println("\nThe number " + check + " is Fizz");
				}
				if(check % 5 == 0)
				{
					System.out.println("\nThe number " + check + " is Buzz");
				}
				if(check % 3 == 0 && check % 5 ==0)
				{
					System.out.println("\nThe number " + check + " is FizzBuzz");
				}
			}
		}
		input.close();
	}
}