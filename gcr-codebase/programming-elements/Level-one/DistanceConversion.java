/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/


import java.util.Scanner;
public class DistanceConversion
{
	public static void main(String[] args)
	{
		//Declare variable Distance
		double distanceFeet, distanceMile, distanceYard;
		
		//Getting an input distance
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Distance in Feet");
		distanceFeet = input.nextDouble();

		//Conversion from one type to other
		distanceYard = distanceFeet * 0.33333333;
		distanceMile = distanceFeet * 0.00018939;

		//Display converted distance
		System.out.println("The distance in yards is " + distanceYard + " and miles is " + distanceMile + " for the distance provided by user in feet " + distanceFeet);
		input.close();
		}
}
