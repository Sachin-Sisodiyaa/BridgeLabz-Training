/*Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/


import java.util.Scanner;
public class SideOfSquare
{
	public static void main(String[] args)
	{
		//Declare variable perimeter & side
		float perimeter, side;

		//creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking perimeter as user input
		System.out.println("Enter perimeter");
		perimeter = input.nextFloat();

		//finding sides of squares
		side = perimeter / 4;

		//Display sides
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		input.close();
	}
}
