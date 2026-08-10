package com.day_6.classwork;

public class BinarySearchIterative {
	
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid  = low + (high-low)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(binarySearch(arr, 5));
	}

}
