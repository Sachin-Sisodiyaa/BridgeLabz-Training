package com.day_7.classwork;

public class StringReversal {
	
	public static void reversal(char str[], int start, int end) {
		if (start >= end)
			return;

		char temp = str[start];
		str[start] = str[end];
		str[end] = temp;

		reversal(str, start + 1, end - 1);
	}
	
	public static void main(String[] args) {
        String str = "Hello";

        char[] arr = str.toCharArray();

        reversal(arr, 0, arr.length - 1);

        System.out.println(new String(arr));
	}

}
