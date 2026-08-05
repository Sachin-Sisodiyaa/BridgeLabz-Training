package com.day_1.hackerrank;

public class CamelCase {
	
	public static int camelcase(String s) {
	    // Write your code here
	    int count = 0;
	    for(int i=0; i<s.length(); i++){
	        char ch = s.charAt(i);
	        if(Character.isUpperCase(ch)){
	            count++;
	        }
	    }
	    return count + 1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "oneTwoThree";
		System.out.println(camelcase(s));

	}

}
