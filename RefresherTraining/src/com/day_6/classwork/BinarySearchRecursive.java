package com.day_6.classwork;

public class BinarySearchRecursive {
	public static int binarySearch(int[] arr, int low, int high, int target) {
		
		if(low > high) {
			return -1;
		}
		int mid = low + (high-low)/2;
		
		if(arr[mid] == target) {
			return mid;
		}
		else if(arr[mid] < target) {
			return binarySearch(arr, mid+1, high, target);
		}
		else {
			return binarySearch(arr, low, mid-1, target);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(binarySearch(arr,0,arr.length-1, 3));
	}
}
