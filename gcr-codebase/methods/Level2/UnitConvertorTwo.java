/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 
*/


import java.util.Scanner;

public class UnitConvertorTwo {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheitToCelsius = (farhenheit - 32) * 5 / 9;
        return farhenheitToCelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsiusToFarhenheit = (celsius * 9 / 5) + 32;
        return celsiusToFarhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592;
        return pounds * poundsToKilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462;
        return kilograms * kilogramsToPounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    // Main method to test conversions
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + convertFarhenheitToCelsius(f));

        System.out.print("\nEnter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFarhenheit(c));

        System.out.print("\nEnter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("\nEnter weight in kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kg));

        System.out.print("\nEnter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));

        System.out.print("\nEnter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));

        sc.close();
    }
}

