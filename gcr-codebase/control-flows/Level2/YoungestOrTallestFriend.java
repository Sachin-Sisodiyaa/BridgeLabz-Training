/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/


import java.util.Scanner;

//program to find which one is youngest or tallest friend amount 3
public class YoungestOrTallestFriend
{
	public static void main(String[] args)
	{
		//Creating object of scanner and taking inputs
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter age of Amar : ");
		int age1 = input.nextInt();
		System.out.print("\nEnter age of Akbar : ");
		int age2 = input.nextInt();
		System.out.print("\nEnter age of Anthony : ");
		int age3 = input.nextInt();
		System.out.print("\nEnter height of Amar : ");
		float height1 = input.nextFloat();
		System.out.print("\nEnter height of Akbar : ");
		float height2 = input.nextFloat();
		System.out.print("\nEnter height of Anthony : ");
		float height3 = input.nextFloat();

		//Conditions and printing result
		if(age1 < age2 && age1 < age3)
		{
			System.out.println("Youngest Friend is Amar");
		}
		else if(age2  < age1 && age2 < age3)
		{
			System.out.println("Youngest Friend is Akbar");
		}
		else
		{
			System.out.println("Youngest Friend is Anthony");
		}
		
		if(height1 > height2 && height1 > height3)
		{
			System.out.println("Tallest Friend is Amar");
		}
		else if(height1 < height2 && height3 < height2)
		{
			System.out.println("Tallest Friend is Akbar");
		}
		else
		{
			System.out.println("\nTallest Friend is Anthony");
		}
		
		input.close();
	}
}