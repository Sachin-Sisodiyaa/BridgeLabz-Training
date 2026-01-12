/*4. Quick Sort - Sort Product Prices
Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.
*/




package javaDSAPractice.com.algorithms.sortingalgorithms.quicksort;

import java.util.Scanner;

public class QuickSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        double[] productPrices = new double[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            productPrices[i] = sc.nextDouble();
        }

        QuickSort quickSort = new QuickSort();
        quickSort.sort(productPrices, 0, n - 1);

        System.out.println("\nSorted Product Prices in Ascending Order:");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}

