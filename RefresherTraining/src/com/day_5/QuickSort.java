package com.day_5;

public class QuickSort {

	public static void main(String args[]) {
		int[] arr = {5,1,9,7,2,6};
		quickSort(arr,0, arr.length-1);
		for(int v : arr) {
			System.out.print(v + " ");
		}
	}

	public static void quickSort(int[] arr, int left, int right) {
		if( left >= right) {
			return;
		}
		int pIdx = partition(arr, left, right);
		quickSort(arr, left, pIdx-1);
		quickSort(arr, pIdx+1, right);
		
		
	}

	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		
		for(int j=left; j<right; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;	
			
		return i + 1;
		
	}
}
