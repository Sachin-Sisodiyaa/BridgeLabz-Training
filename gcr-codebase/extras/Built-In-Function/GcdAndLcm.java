/*7. GCD and LCM Calculator:
○ Create a program that calculates the Greatest Common Divisor (GCD) and Least
Common Multiple (LCM) of two numbers using functions.
○ Use separate functions for GCD and LCM calculations, showcasing how modular
code works.*/



import java.util.Scanner;
import java.math.BigInteger;

public class GcdAndLcm {

    //Method to find GCD
    public static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }

    //Method to find LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
        sc.close();
    }
}
