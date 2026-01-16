package com.dayfour.eventmanager;

public class QuickSort {

	public static void sort(float[] prices, int si, int ei) {
		if(si >= ei) {
			return;
		}
		
		int pidx = partition(prices, si, ei);
		sort(prices, si, pidx-1);
		sort(prices, pidx+1, ei);
	}
	
	public static int partition(float[] prices, int si, int ei) {
		float pivot = prices[ei];
		int i = si -1;
		
		for(int j=si; j<ei; j++) {
			if(prices[j] <= pivot) {
				
				i++;
				float temp = prices[j];
				prices[j] = prices[i];
				prices[i] = temp;
			}
		}
			
		i++;
		float temp = pivot;
		prices[ei] = prices[i]; 
		prices[i] = temp;
		return i;
	}
}
