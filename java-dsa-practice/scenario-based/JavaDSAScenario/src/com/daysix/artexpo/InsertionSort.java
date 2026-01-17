package com.daysix.artexpo;

public class InsertionSort {
	
	public static void sort(RegistrationData[] data) {
		for(int i=1; i<data.length; i++) {
			RegistrationData key = data[i];
			int j = i - 1;
			
			while(j >= 0 && data[j].time.isAfter(key.time)) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = key;
		}
	}
}
