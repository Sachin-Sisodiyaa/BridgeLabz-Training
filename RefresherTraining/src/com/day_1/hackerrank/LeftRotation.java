package com.day_1.hackerrank;
import java.util.*;

public class LeftRotation {
	
	public static List<Integer> rotate(List<Integer> a) {
	    // Write your code here
	        int first = a.get(0);
	        
	        for(int i=0; i<a.size()-1; i++){
	            a.set(i, a.get(i+1));
	        }
	        a.set(a.size()-1, first);
	        return a;
	    }

	    public static List<Integer> rotLeft(List<Integer> a, int d) {
	    // Write your code here
	        for(int i=0; i<d; i++){
	            rotate(a);
	        }
	        return a;
	    }
	    
	    public static void main(String args[]) {
	    	List<Integer> l = new ArrayList<>();
	    	int d = 4;
	    	
	    	l.add(1);
	    	l.add(2);
	    	l.add(3);
	    	l.add(4);
	    	l.add(5);
	    	
	    	rotLeft(l, 4);
	    	
	    	for(int i : l) {
	    		System.out.print(i);
	    	}
	    }

}
