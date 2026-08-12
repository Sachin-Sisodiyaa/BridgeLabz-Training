package com.day_5.classwork;

public class ShellSort {
	
	public static void sort(int[] arr) {
		int n = arr.length;
		for(int gap = n/2; gap > 0; gap /= 2) {
			for(int i=gap; i<n; i++) {
				int temp = arr[i];
				int j = i;
				while(j>=gap && arr[j-gap] > temp) {
					arr[j] = arr[j-gap];
					j -= gap;
				}
				arr[j] = temp;
			}
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {2,5,9,1,0};
		sort(arr);
		for(int v : arr) {
			System.out.print(v + " ");
		}
	}
}
