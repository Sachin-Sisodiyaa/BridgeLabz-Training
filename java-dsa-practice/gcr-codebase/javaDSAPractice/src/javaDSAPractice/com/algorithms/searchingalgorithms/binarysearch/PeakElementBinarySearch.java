package javaDSAPractice.com.algorithms.searchingalgorithms.binarysearch;

import java.util.Scanner;

public class PeakElementBinarySearch {

    static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak lies on the right side
                left = mid + 1;
            } else {
                // Peak lies on the left side (or mid itself)
                right = mid;
            }
        }
        return left; // or right (both are same)
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

        int peakIndex = findPeak(arr);
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        sc.close();
    }
}
