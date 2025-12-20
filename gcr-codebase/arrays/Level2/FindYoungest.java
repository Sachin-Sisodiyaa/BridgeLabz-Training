/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/



import java.util.Scanner;

public class FindYoungest
{	public static void main(String[] args)
	{
		//Take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ages of Amar, Akbar, and Anthony: ");
		int age[] = new int[3];
		for(int i=0; i<3; i++)
		{
			age[i] = input.nextInt();
		}
		System.out.print("Enter height Amar, Akbar, and Anthony: ");
		float height[] = new float[3];
		for(int i=0; i<3; i++)
		{
			height[i] = input.nextFloat();
		}
		float tallest = height[0];
		int youngest = age[0];
	
		//Logic finding youngest and tallest
	        for (int i = 1; i < 3; i++) 
		{
            		if (age[i] < youngest) 
			{
                		youngest = age[i];
            		}

            		if (height[i] > tallest) {
                		tallest = height[i];
            		}
        	}
		System.out.println("Youngest friend's age: " + youngest);
        	System.out.println("Tallest friend's height: " + tallest);
		
		input.close();
	}
}
