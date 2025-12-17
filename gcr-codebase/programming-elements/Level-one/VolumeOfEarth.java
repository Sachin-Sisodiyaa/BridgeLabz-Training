/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/


public class VolumeOfEarth
{
	public static void main(String[] args)
	{
		//initialization of radius

		double radiusKm = 6378;
		double radiusMiles = radiusKm * 0.621371;

		//calculating volumes in cubic kilometers and cubic miles

		double volumeCubicKm = (4.0/3) * Math.PI * radiusKm * radiusKm * radiusKm;
		double volumeCubicMiles = (4.0/3) * Math.PI * radiusMiles * radiusMiles * radiusMiles;
		
		// Display the result in two ways

		System.out.println("The volume of earth in cubic kilometers is " + volumeCubicKm + " and cubic miles is " + volumeCubicMiles);
		System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeCubicKm, volumeCubicMiles);
	}
}