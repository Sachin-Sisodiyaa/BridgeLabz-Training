package com.day_2;
import java.util.*;

public class BalancedBrackets {
	public static String isBalanced(String s) {
	    // Write your code here
	    Stack<Character> stack = new Stack<>();
	    for(char c : s.toCharArray()){
	        if(c == '(' || c == '[' || c == '{'){
	            stack.push(c);
	        }
	        else{
	            if(stack.isEmpty()){
	                return "NO";
	            }
	            
	            char top = stack.pop();
	            
	            if(c == ')' && top != '('){
	                return "NO";
	            }
	            if(c == ']' && top != '['){
	                return "NO";
	            }
	            if(c == '}' && top != '{'){
	                return "NO";
	            }
	        }
	    }
	    
	    return stack.isEmpty() ? "YES" : "NO";

	    }
	
	public static void main(String args[]) {
		System.out.println(isBalanced("{[()]]}"));
	}

}
