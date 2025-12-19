/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/


import java.util.Scanner;

public class CheckNumbersNature
{
	public static void main(String[] args)
	{
		//Taking inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers : ");
		int number[]  = new int[5];
		for(int i=0; i<5; i++)
		{
			number[i] = input.nextInt();
		}
		
		//Logic of checking and printing result
		for(int i=0; i<number.length; i++)
		{
			if(number[i] > 0)
			{
				if(number[i] % 2 == 0)
				{
					System.out.println("The Number " + number[i] + " is Even");
				}
				else
				{
					System.out.println("The Number " + number[i] + " is Odd");	
				}
			}
		
                	else if(number[i] == 0)
			{
				System.out.println("The Number " + number[i] + " is Zero");
			}
			else
			{
				System.out.println("The Number " + number[i] + " is Negative");
			}

			
		}
		if(number[0] > number[number.length-1])
			{
				System.out.println("First number " + number[0] + " is Greater Than last number " + number[number.length-1]);
			} 
			else if(number[0] < number[number.length-1])
			{
				System.out.println("First number " + number[0] + " is Less Than last number " + number[number.length-1]);
			} 
			else
			{
				System.out.println("First number " + number[0] + " is Equal To last number " + number[number.length-1]);
			}
		input.close();
	}
}
