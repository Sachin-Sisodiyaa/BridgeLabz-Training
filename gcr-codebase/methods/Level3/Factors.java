/*Write a program to find the factors of a number and perform various tasks using the factors array
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops: one for the count and another for finding the factor and storing in the array
Method to find the greatest factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find the product of the cube of the factors using the factors array. Use Math.pow() 
*/


import java.util.Scanner;

public class FactorUtility {

    // Method to find factors of a number and return as array
    public static int[] findFactors(int number) {

        //Count of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor using factors array
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	System.out.print("Enter number : ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Number: " + number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

	input.close();
    }
}
