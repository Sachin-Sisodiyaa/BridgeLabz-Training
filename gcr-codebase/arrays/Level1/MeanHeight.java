/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/


import java.util.Scanner;

//program to print multiplication table of given input number
public class MeanHeight
{
	public static void main(String[] args)
	{
		//Creating object of scanner and taking input number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter heights of player : ");
		double height[] = new double[11];
		double sum = 0.0;
		for(int i=0; i<height.length; i++)
		{
			height[i] = input.nextDouble();
			sum += height[i];
		}
		


		//Logic and Printing output
		double meanHeight = sum / 11;
		System.out.println("The mean height of the football team is : " + meanHeight);

		input.close();
	}
}