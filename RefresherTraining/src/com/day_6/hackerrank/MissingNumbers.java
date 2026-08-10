package com.day_6.hackerrank;
import java.util.*;

public class MissingNumbers {
   
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

   public static List<Integer> missingNumbers(
           List<Integer> arr,
           List<Integer> brr) {

       Collections.sort(arr);
       Collections.sort(brr);

       List<Integer> result = new ArrayList<>();

       for (int i = 0; i < brr.size(); i++) {

           int num = brr.get(i);

           if (i > 0 && brr.get(i).equals(brr.get(i - 1))) {
               continue;
           }

           int index = binarySearch(arr, num);

           if (index == -1) {
               result.add(num);
               continue;
           }

           int countBrr = 0;

           for (int j = i; j < brr.size() && brr.get(j) == num; j++) {
               countBrr++;
           }

           int countArr = 0;

           for (int j = 0; j < arr.size(); j++) {
               if (arr.get(j) == num) {
                   countArr++;
               }
           }

           if (countBrr > countArr) {
               result.add(num);
           }
       }

       return result;
   }
   
   
   public static void main(String[] args) {

	    List<Integer> arr = Arrays.asList(7, 2, 5, 3, 5, 3);
	    List<Integer> brr = Arrays.asList(7, 2, 5, 4, 4, 6, 3, 5, 3);

	    List<Integer> result = missingNumbers(arr, brr);

	    System.out.println(result);
	}

}
