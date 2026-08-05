package com.day_1.hackerrank;

public class SimpleArraySum {

	public static int simpleArraySum(int [] ar) {
	    // Write your code here
	    int sum = 0;
	    for(int a: ar){
	        sum += a;
	    }
	    return sum;
	    }

	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		
		int sum = simpleArraySum(arr);
		System.out.println(sum);
	}
}
