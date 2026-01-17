package com.daysix.smartlibrary;

public class InsertionSort {
	
	public static void sort(String[] books, int idx) {
		String key = books[idx];
		int j = idx - 1;
		
		while(j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
			books[j+1] = books[j];
			j--;
		}
		books[j+1] = key;
	}
}
