package com.day_2.hackerrank;
import java.util.*;

public class MaximumElement {
	public static List<Integer> getMax(List<String> operations) {
	    // Write your code here
	    Stack<Integer> stack = new Stack<>();
	    Stack<Integer> maxStack = new Stack<>();
	    List<Integer> res = new ArrayList<>();
	    
	    for(String s: operations){
	        String[] parts = s.split(" ");
	        int op = Integer.parseInt(parts[0]);
	        if(op == 1){
	            int value = Integer.parseInt(parts[1]);
	            stack.push(value);
	            
	            if(maxStack.isEmpty()){
	                maxStack.push(value);
	            }
	            else{
	                maxStack.push(Math.max(value, maxStack.peek()));
	            }
	                
	            }
	            else if(op == 2){
	                if(!stack.isEmpty()){
	                    stack.pop();
	                    maxStack.pop();
	                }
	            }
	            else{
	                res.add(maxStack.peek());
	            }
	        }
	        return res;
	    }
	
	public static void main(String[] args) {

	    List<String> operations = new ArrayList<>();

	    operations.add("1 97");
	    operations.add("2");
	    operations.add("1 20");
	    operations.add("2");
	    operations.add("1 26");
	    operations.add("1 20");
	    operations.add("3");
	    operations.add("1 91");
	    operations.add("3");

	    List<Integer> result = getMax(operations);

	    System.out.println(result);
	}

}



