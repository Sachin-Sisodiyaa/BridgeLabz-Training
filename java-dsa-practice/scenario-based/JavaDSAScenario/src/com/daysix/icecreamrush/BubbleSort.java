package com.daysix.icecreamrush;

public class BubbleSort {

	public static void sort(String[] flavours, int[] sold) {
		for(int i=0; i<flavours.length-1; i++) {
			for(int j=0; j<sold.length-1-i; j++) {
				
				if(sold[j] < sold[j+1]) {
					int temp1 = sold[j];
					sold[j] = sold[j+1];
					sold[j+1] = temp1;
					
					String temp2 = flavours[j];
					flavours[j] = flavours[j+1];
					flavours[j+1] = temp2;
				}
			}
		}
	}
}
