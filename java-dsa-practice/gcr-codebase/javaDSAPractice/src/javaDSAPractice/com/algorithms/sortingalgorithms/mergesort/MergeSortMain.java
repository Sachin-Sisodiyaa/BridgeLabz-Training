/*3. Merge Sort - Sort an Array of Book Prices
Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements.
*/



package javaDSAPractice.com.algorithms.sortingalgorithms.mergesort;

import java.util.Scanner;

public class MergeSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        double[] bookPrices = new double[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            bookPrices[i] = sc.nextDouble();
        }

        // Create MergeSort object
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(bookPrices, 0, n - 1);

        System.out.println("\nSorted Book Prices in Ascending Order:");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}
