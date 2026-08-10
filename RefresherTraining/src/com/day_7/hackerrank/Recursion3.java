package com.day_7.hackerrank;

public class Recursion3 {
	public static int factorial(int n) {
	    // Write your code here
	        if(n==0 || n==1){
	            return 1;
	        }
	        
	        return n*factorial(n-1);

	    }
	public static void main(String args[]) {
		System.out.println(factorial(5));
	}
}
