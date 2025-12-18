/*Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint => 
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 
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

		//Condition + loop + printing result
		if(number >= 6 && number <= 9)
		{
			for(int count=1; count<=10; count++)
			{
				System.out.println(number + " * " + count + " = " + count*number);
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		input.close();
	}
}