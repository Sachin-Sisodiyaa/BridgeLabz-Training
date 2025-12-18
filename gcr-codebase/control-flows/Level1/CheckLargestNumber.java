/* Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/


import java.util.Scanner;

//program to find which number is largest
public class CheckLargestNumber
{
	public static void main(String[] args)
	{
		//Variable declaration
		int first, second, third;

		//Creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking inputs
		System.out.print("\nEnter first number : ");
		first = input.nextInt();
		System.out.print("\nEnter second number : ");
		second = input.nextInt();
		System.out.print("\nEnter third number : ");
		third = input.nextInt();

		//Checking conditions and printing the results
		System.out.println("Is the first number the largest? : " + (first > second && first > third));
		System.out.println("Is the second number the largest? : " + (first < second && second > third));
		System.out.println("Is the third number the largest? : " + (third > second && first < third));
		input.close();
	}
}

