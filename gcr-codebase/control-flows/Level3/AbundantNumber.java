/*Create a program to check if a number is an Abundant Number.
Hint => 
An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Run a for loop from i = 1 to i < number.
Inside the loop, check if number is divisible by i.
If true, add i to sum.
Outside the loop Check if sum is greater than number.
If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
*/



import java.util.Scanner;

public class AbundantNumber
{
	public static void main(String[] args)
	{
	
		// Taking inputs
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = input.nextInt();
	

		// Cheking number is abundant or not
		int divisorsSum = 0;
		for(int i=1; i<=number/2; i++)
		{
			if(number % i == 0)
			{
				divisorsSum += i;
			}
		}

		
		if(divisorsSum > number){
			System.out.print("The Number " + number + " is Abundant Number");
		}
		else{
			System.out.print("Given number " + number + " is not Abundant Number");
		}
	input.close();

	}

}