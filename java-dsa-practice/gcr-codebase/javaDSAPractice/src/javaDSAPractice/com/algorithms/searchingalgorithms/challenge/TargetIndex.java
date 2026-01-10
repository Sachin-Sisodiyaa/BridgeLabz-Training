package javaDSAPractice.com.algorithms.searchingalgorithms.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class TargetIndex {

    // Binary Search function
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target number to search: ");
        int target = sc.nextInt();

        // Sort array
        Arrays.sort(arr);

        // Binary search
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index in sorted array: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }

        sc.close();
    }
}
