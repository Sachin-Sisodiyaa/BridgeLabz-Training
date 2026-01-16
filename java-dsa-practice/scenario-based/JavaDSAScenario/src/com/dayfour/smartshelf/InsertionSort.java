package com.dayfour.smartshelf;

public class InsertionSort {
	public static void sort(String[] books) {
		for(int i=1; i<books.length; i++) {
			String key = books[i];
			int j = i - 1;
			
			while(j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
				books[j + 1] = books[j];
				j--;
			}
			books[j + 1] = key;
		}
	
	} 
} 
