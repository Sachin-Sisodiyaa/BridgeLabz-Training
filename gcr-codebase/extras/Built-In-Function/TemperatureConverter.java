/*8. Temperature Converter:
○ Write a program that converts temperatures between Fahrenheit and Celsius. ○
The program should have separate functions for converting from Fahrenheit to
Celsius and from Celsius to Fahrenheit.*/




import java.util.Scanner;

public class TemperatureConverter {

    //Method to convert temperature from Fahrenheit to celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    //Method to convert temperature from Celsius to  Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c')
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        else
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));

        sc.close();
    }
}
