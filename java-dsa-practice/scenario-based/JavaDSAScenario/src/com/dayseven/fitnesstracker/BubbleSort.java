package com.dayseven.fitnesstracker;

public class BubbleSort {

	public static void sort(int[][] stepsCount) {
		int n = stepsCount.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(stepsCount[j][1] < stepsCount[j+1][1]) {
					
					int temp1 = stepsCount[j][0];
					stepsCount[j][0] = stepsCount[j+1][0];
					stepsCount[j][0] = temp1;
					
					
					int temp2 = stepsCount[j][1];
					stepsCount[j][1] = stepsCount[j+1][1];
					stepsCount[j+1][1] = temp2;
				}
			}
		}
	}
}
