/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method*/


import java.util.Scanner;

public class Factors {

    //Method to count and create factors array
    public static int[] generateFactors(int number) {
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

    //Method to find sum of factors
    public int findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    //Method to find product of factors
    public int findProduct(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    //Method to find sum of square of factors
    public int findSquareSum(int[] factors) {
        int squareSum = 0;
        for (int i = 0; i < factors.length; i++) {
            squareSum += factors[i] * factors[i];
        }
        return squareSum;
    }

    public static void main(String[] args) {
	// Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive number only.");
            return;
        }

	//Calling methods
        Factors obj = new Factors();

        int[] factors = generateFactors(number);

        int sum = obj.findSum(factors);
        int product = obj.findProduct(factors);
        int squareSum = obj.findSquareSum(factors);

	//printing results
        System.out.println("\nFactors:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Sum of Squares: " + squareSum);

        sc.close();
    }
}
