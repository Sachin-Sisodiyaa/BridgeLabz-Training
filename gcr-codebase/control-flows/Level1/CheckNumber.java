/* Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero. 
*/


import java.util.Scanner;

//Check wheather the number is positive , negative or zero
public class CheckNumber
{
	public static void main(String[] args)
	{
		//Variable declaration
		int number;

		//Creating Scanner class object and taking input
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter number : ");
		number = input.nextInt();

		//logic and printing output
		if(number > 0){
			System.out.println("Positive");
		}
		else if(number < 0) {
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
		input.close();
	}
}
