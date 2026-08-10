package com.day_6.classwork;

public class LinearSearch {

	public static void main(String args[]) {
		int[] arr = {2,6,4,1,0};
		int target = 40;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				System.out.println("Element at index: " + i + "value : " + arr[i]);
				return;
			}
		}
		System.out.println("Not Found");
	}
}
