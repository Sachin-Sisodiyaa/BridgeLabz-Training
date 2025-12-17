/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/


import java.util.Scanner;
public class AreaOfTriangle
{
	public static void main(String[] args)
	{
		//Declare variable base and height
		float base, height;
		double baseInch, heigthInch;
		double areaCM, areaInches;

		//creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking inputs from user
		System.out.println("Enter Base");
		base = input.nextFloat();
		System.out.println("Enter Heigth");
		height = input.nextFloat();
		baseInch = base * 0.39370079;
		heigthInch = height * 0.39370079;

		//Calculating area
		areaCM = 1.0/2 * base * height;
 		areaInches = 1.0/2 * baseInch * heigthInch;

		//Display Result
		System.out.println("Area of a triangle in square inches is " + areaInches + " and square centimeters is " + areaCM);
		input.close();
	}
}
