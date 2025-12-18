/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20
*/


// import java.util.Scanner;

//Program to check spring season 
public class SpringSeason
{
	public static void main(String[] args)
	{
		//Variable declaration
		int month, day;

		// Enter input in command line
		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);

		//Logic and printing output
		if((month == 3) && (day >= 20 && day <=31))
			System.out.println("Its a Spring Season");

		else if((month == 4 ) && (day >= 1 && day <=30) || (month == 5) && (day >= 1 && day <=31))
			System.out.println("Its a Spring Season");

		else if((month == 6) && (day >= 1 && day <=20))
			System.out.println("Not a Spring Season");
		
		else
			System.out.println("Not a Spring Season");
	}
}