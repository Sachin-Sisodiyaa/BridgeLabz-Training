package com.day_1.hackerrank;

public class BirthdayCakeCandles {
	
	public static int birthdayCakeCandles(int[] candles) {
	    // Write your code here
	        int max = 0;
	        int count  = 0;
	        for(int a : candles){
	        
	            if(max < a){
	                max = a;
	            }
	        }
	        for(int a : candles){
	            if(a==max){
	                count++;
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,4,1,3};
		
		System.out.println(birthdayCakeCandles(arr));
	}

}
