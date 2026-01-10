package javaDSAPractice.com.algorithms.searchingalgorithms.challenge;

import java.util.Scanner;

public class FirstMissingPositiveLinear {

    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1]; // track 1..n

        // Mark numbers present in the array
        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        // Find first missing positive
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n + 1; // if all 1..n are present
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive number: " + missing);

        sc.close();
    }
}
