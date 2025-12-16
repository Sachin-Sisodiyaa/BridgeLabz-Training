/*5. Volume of a Cylinder
Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:
Volume = π * radius^2 * height. */

import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the radius: ");
        
            double radius = sc.nextDouble();

            System.out.print("Enter the height: ");
        
            double height = sc.nextDouble();

            double volume = (double)Math.PI * radius * radius * height;

            System.out.print("Volume of Cylinder = " + volume);

        }
    }
}
