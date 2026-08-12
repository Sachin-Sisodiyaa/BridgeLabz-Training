package com.day_5.hackerrank;
import java.util.*;

public class QuickSort1 {
	
	public static List<Integer> quickSort(List<Integer> arr) {
	    // Write your code here
	        int p = arr.get(0);
	        List<Integer> left = new ArrayList<>();
	        List<Integer> equal = new ArrayList<>();
	        List<Integer> right = new ArrayList<>();
	        
	        for(int i : arr){
	            if(i<p){
	                left.add(i);
	            }
	            else if(i>p){
	                right.add(i);
	            }
	            else{
	                equal.add(i);
	            }
	        }
	        List<Integer> res = new ArrayList<>();
	        for(int i : left){
	            res.add(i);
	        }
	        for(int i : equal){
	            res.add(i);
	        }
	        for(int i : right){
	            res.add(i);
	        }
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		
		l.add(5);
		l.add(3);
		l.add(1);
		l.add(7);
		l.add(9);
		l.add(2);
		
		List<Integer> result = quickSort(l);
		for(int v : result) {
			System.out.print(v + " ");
		}
	}

}
