/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order 
*/



import java.util.Scanner;

public class ReverseNumber
{	public static void main(String[] args)
	{
		//Take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number :");
		int originalNumber = input.nextInt();
		int count = 0;
		int number = originalNumber;
		
		while(number > 0)
		{	
			count++;
			number /= 10;
			
		}
		number = originalNumber;
		int digits[] = new int[count];
		for(int i=0; i<count; i++)
		{			
			digits[i] = number % 10;
			number /= 10;

		}

		//printing results
		System.out.print("The number is : " + originalNumber + " Reverse number is : ");
		for(int i=0; i<digits.length; i++)
		{
			System.out.print(digits[i] + " ");
		}

		input.close();
	}
}
