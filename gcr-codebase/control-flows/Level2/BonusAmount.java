/*Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/


import java.util.Scanner;

//program to find bonus amount based on year of experience
public class BounsAmount
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter salary : ");
		double salary = input.nextDouble();
		System.out.print("\nEnter year of experience : ");
		int year = input.nextInt();
		double bonus = 0.0;
		
		//Condition
		if(year >= 5)
		{
			bonus = salary * 5 / 100;
		}

		//Print result
		System.out.println("\nBonus Amount is : " + bonus);

		input.close();
	}
}
