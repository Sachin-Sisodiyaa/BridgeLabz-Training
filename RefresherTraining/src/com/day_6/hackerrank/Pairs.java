package com.day_6.hackerrank;
import java.util.*;

public class Pairs {
	public static int binarySearch(List<Integer> arr, int target) {

        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (arr.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int pairs(int k, List<Integer> arr) {

        Collections.sort(arr);

        int count = 0;

        for (int num : arr) {

            int target = num + k;

            if (binarySearch(arr, target) != -1) {
                count++;
            }
        }

        return count;
    }
    
    
    public static void main(String[] args) {

        List<Integer> arr =
                Arrays.asList(1, 5, 3, 4, 2);

        int k = 2;

        int result = pairs(k, arr);

        System.out.println(result);
    }
}
