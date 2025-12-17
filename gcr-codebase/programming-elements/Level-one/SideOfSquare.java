/*Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/


import java.util.Scanner;
public class sideOfSquare
{
	public static void main(String[] args)
	{
		//Declare variable perimeter & side
		float perimeter, side;

		//Taking perimeter as user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter perimeter");
		perimeter = input.nextFloat();

		//finding sides of squares
		side = perimeter / 4;

		//Display sides
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		input.close();
		}
}
