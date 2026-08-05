package com.day_1.hackerrank;
import java.util.*;

public class ArraysDS {
	
	public static List<Integer> reverseArray(List<Integer> a) {
	    // Write your code here
	    Collections.reverse(a);
	    return a;
	}
	
	public static int[] reverse(int arr[]) {
		int j = arr.length-1;
		int reverse[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			reverse[j] = arr[i];
			j--;
		}
		
		return reverse;
		
	}

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a);
		reverseArray(a);
		System.out.println(a);
		
		int[] arr = {1,2,3,4};
		int rev[] = reverse(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(rev[i]);
		}
		
	}

}
