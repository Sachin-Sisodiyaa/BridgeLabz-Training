/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___

*/


import java.util.Scanner;

//program to print multiplication table of given input number
public class MultiplicationTable
{
	public static void main(String[] args)
	{
		//Creating object of scanner and taking input number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 6 to 9 : ");
		int number = input.nextInt();
		int multiplicationResult[] = new int[10];

		//Logic and Printing output
		for(int i=0; i<multiplicationResult.length; i++)
		{
			multiplicationResult[i] = number * (i + 1);
			System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
		}

		input.close();
	}
}