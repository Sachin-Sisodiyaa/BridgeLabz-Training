package com.day_6.classwork;

public class FirstLastOcurrence {
	
	public static void main(String args[]) {
		int[] arr = {1,2,4,4,4,4,7,9};
		int target = 4;
		System.out.println(firstOcurrence(arr, target));
		System.out.println(lastOcurrence(arr, target));
	}

	public static int lastOcurrence(int[] arr, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = arr.length-1;
		int result = 0;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) {
				result = mid;
				left = mid + 1;
			}
			
			if(arr[mid] > target) {
				left = mid-1;
			}
			else {
				right = mid+11;
			}
		}
		return result;
		
	}

	public static int firstOcurrence(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		int result = 0;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) {
				result = mid;
				left = mid+1;
			}
			
			if(arr[mid] < target) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return result;
		
	}

}
