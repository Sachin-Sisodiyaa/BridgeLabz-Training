package com.day_16.classwork;

public class GenericMethod {
	
	
	public static <T> void print(T[] arr) {
		for(T a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	
	
	
	public static void main(String args[]) {
		String[] s = {"ABC","PQR", "XYZ"};
		Integer[] arr  = {1,2,3,4,5};
		Double[] d = {5.5,7.2,9.0,3.76};
		print(arr);
		print(s);
		print(d);
	}

}
