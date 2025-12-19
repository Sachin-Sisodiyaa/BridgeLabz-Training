/* Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
*/


import java.util.Scanner;

//Program to find leap year in single condition
public class LeapYearSingleCondition
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int year = input.nextInt();
		

		//Conditions and printing result
		if(year >= 1582 && (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)))
		{
			System.out.println(year + " is a Leap Year ");
		}
		else
		{
			System.out.println(year + " is not a Leap Year ");
		}
		input.close();
	}
}
				