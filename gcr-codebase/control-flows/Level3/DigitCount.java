/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
*/



import java.util.Scanner;

//Program to calculate digits in a number
public class DigitCount
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = input.nextInt();
		int count = 0 , counter = number;
		

		//Conditions and printing result
		while(counter > 0)
		{
			counter = counter/10;
			count++;
		}
		//print count	
			System.out.println("Count of digit in number: " + number + " is " + count);	
		
		input.close();
	}
}
	