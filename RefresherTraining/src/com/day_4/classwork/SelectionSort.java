package com.day_4.classwork;

public class SelectionSort {
	
	public static void sort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int minPos = i;
			for(int j=0; j<arr.length; j++) {
				if(arr[minPos] > arr[j]) {
					minPos = j;
				}
			}
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,1,7,3};
		
		sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i);
		}

	}

}
