/*5. Convert Kilometers to Miles
Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371. */

import java.util.Scanner;
public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Miles");

            double miles = sc.nextDouble();

            double kilometers = (miles * 0.621371);

            System.out.println("Distance of miles in kilometer = " + kilometers);
        }
    }
}
