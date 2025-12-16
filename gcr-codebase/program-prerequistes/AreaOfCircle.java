/*4. Area of a Circle
Write a program to calculate the area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2. */

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the radius:  ");

            double radius = sc.nextFloat();

            double area = 3.14 * (radius * radius);

            System.out.print("Area for given radius = " + area);
        }
    }
}
