/*Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint => 
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.
*/


import java.util.Scanner;

//program to find multiples of a number using while loop
public class MultiplesOfNumberWithWhilLoop
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and take inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		int counter = number - 1;
			
		//condition + loop to find multiples and print it
		if(number <= 0 || number >= 100)
		{
			System.out.println("Invalid input");
		}
		else
		{
			while(counter > 1)
			{
				if(number % counter == 0)
				{
					System.out.println(counter);	
				}
					counter--;
			}
		}
		input.close();
	}
}