package com.day_1.hackerrank;

public class PlusMinus {
	
	public static void plusMinus(int[] arr) {
	    // Write your code here
	        int plus = 0;
	        int minus = 0;
	        int zero = 0;
	        for(int a : arr){
	            if(a < 0){
	                minus++;
	            }
	            else if(a > 0){
	                plus++;
	            }
	            else{
	                zero++;
	            }
	        }
	        System.out.println((double)plus/arr.length);
	        System.out.println((double)minus/arr.length);
	        System.out.println((double)zero/arr.length);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,0,-1,-1};
		
		plusMinus(arr);

	}

}
