/*Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:
Perimeter = 2 * (length + width). */ 

import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter length");

            double length = sc.nextDouble();

            System.out.println("Enter principle width");

            double width = sc.nextDouble();

            double perimeter = 2 * (length + width);

            System.out.println("Perimeter of length : " + length + "and width :" + width + " = " + perimeter);
        }
    }
}
