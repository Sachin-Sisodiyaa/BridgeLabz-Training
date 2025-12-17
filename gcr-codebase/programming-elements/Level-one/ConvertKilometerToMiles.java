/*Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/

public class ConvertKilometerToMiles
{
	public static void main(String[] args)
	{
		double distanceInKilometers = 10.8;
		double mileInOneKilometer = 1.6;
		double distanceInMiles = distanceInKilometers * mileInOneKilometer;
		System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
	}
}