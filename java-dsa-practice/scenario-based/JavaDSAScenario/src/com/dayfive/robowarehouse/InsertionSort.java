package com.dayfive.robowarehouse;

public class InsertionSort {
	
	public static void sort(float[] weights, int idx) {
		float key = weights[idx];
		int j = idx - 1;
		
		while(j >= 0 && weights[j] > key) {
			weights[j+1] = weights[j];
			j--;
		}
		weights[j+1] = key;
	}
}
