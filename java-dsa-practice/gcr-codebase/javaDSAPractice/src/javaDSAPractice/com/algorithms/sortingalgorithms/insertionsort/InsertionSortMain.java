/*2. Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/




package javaDSAPractice.com.algorithms.sortingalgorithms.insertionsort;

import java.util.Scanner;

public class InsertionSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] employeeIds = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIds[i] = sc.nextInt();
        }

        // Create object of InsertionSort
        InsertionSort sorter = new InsertionSort();
        sorter.sort(employeeIds);

        System.out.println("\nSorted Employee IDs in Ascending Order:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}
