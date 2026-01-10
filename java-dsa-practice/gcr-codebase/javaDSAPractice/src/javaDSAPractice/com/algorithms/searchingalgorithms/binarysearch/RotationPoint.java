package javaDSAPractice.com.algorithms.searchingalgorithms.binarysearch;

import java.util.Scanner;

public class RotationPoint {

    static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half including mid
                right = mid;
            }
        }

        return left; // index of smallest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotationIndex = findRotationPoint(arr);
        System.out.println("Rotation point index of smallest element: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);

        sc.close();
    }
}
