/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint = 1 foot = 12 inches and 1 inch = 2.54 cm
IP = height
OP = Your Height in cm is ___ while in feet is ___ and inches is ___*/



import java.util.Scanner;
public class HeigthConversion
{ 
	public static void main(String[] args)
	{
		//Declare variable

		float height;

		//Getting input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter heigth in cm");
		height = input.nextFloat();
		
		//Perform conversions
		double heigthInches = height * 0.39370079;
		double heigthFeet = heigthInches * 0.08333333;
		
		//Display converted heights
		System.out.println("Your Height in cm is " + height + " while in feet is " + heigthFeet + " and inches is " + heigthInches);
	}
}
