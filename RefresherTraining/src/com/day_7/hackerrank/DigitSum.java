package com.day_7.hackerrank;

public class DigitSum {
//	public static int superDigit(String n, int k) {
//
//        long sum = 0;
//
//        for (char c : n.toCharArray()) {
//            sum += c - '0';
//        }
//
//        sum = sum * k;
//
//        return findSuperDigit(sum);
//    }
//
//    public static int findSuperDigit(long num) {
//
//        if (num < 10) {
//            return (int) num;
//        }
//
//        long sum = 0;
//
//        while (num > 0) {
//            sum += num % 10;
//            num = num / 10;
//        }
//
//        return findSuperDigit(sum);
//    }
	
	
	public static int superDigit(String n, int k) {
	    // Write your code here
	        long sum = 0;
	        
	        for(char c : n.toCharArray()){
	            sum += c - '0';
	        }
	        sum *= k;
	        
	        if(sum < 10){
	            return (int) sum;
	        }
	        
	        return superDigit(String.valueOf(sum), 1);

	    }
	
    public static void main(String[] args) {

        String n = "148";
        int k = 3;

        int result = superDigit(n, k);

        System.out.println(result);
    }
}
