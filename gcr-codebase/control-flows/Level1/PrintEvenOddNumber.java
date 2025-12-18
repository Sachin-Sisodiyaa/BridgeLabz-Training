/*Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
*/



import java.util.Scanner;

//program to check numbers between 1 to n is even or odd 
public class PrintEvenOddNumber
{
	public static void main(String[] arge)
	{
		//Creating object of scanner class and taking inputs
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int number = input.nextInt();
		
		//loop and condition to check even, odd, natural and printing result 
		for(int counter=1; counter<=number; counter++)
		{
			if(counter >= 0 && counter % 2 == 0)
			{
				System.out.println("Even number : " + counter);
			}
			if(counter >=0 && counter % 2 == 1)
			{
				System.out.println("Odd number : " + counter);
			}
		}
		input.close();
	}
}
			