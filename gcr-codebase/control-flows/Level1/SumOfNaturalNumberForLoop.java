/* Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/



import java.util.Scanner;

//program to calculate sum of natural numbers using For-loop
public class SumOfNaturalNumbersForLoop
{
	public static void main(String[] args)
	{
		//Declare Variable
		int number , sum1 = 0, sum2 = 0;

		//Creating object of scanner class and taking inputs
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a number :");
		number = input.nextInt();

		//Condition, computation and print output
		if(number >= 0)
		{	
			sum1 = number * (number + 1) / 2;
		}
		for(int count=1; count<=number; count++)
		{
			sum2 += count;
		}
		if(sum1 == sum2)
		{
			int result = sum1;
			System.out.println("\nFinal result is : " + result);
		}

		//closing scanner
		input.close();
	}
}
