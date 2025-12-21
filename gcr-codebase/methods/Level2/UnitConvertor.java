/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
*/


import java.util.Scanner;

public class UnitConvertor {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to test all conversions
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(yards));

        System.out.print("\nEnter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Yards: " + convertFeetToYards(feet));

        System.out.print("\nEnter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Inches: " + convertMetersToInches(meters));

        System.out.print("\nEnter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Meters: " + convertInchesToMeters(inches));
        System.out.println("Centimeters: " + convertInchesToCentimeters(inches));

        sc.close();
    }
}


