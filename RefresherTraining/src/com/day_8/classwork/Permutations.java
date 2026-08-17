package com.day_8.classwork;
import java.util.*;

public class Permutations {

	public static void generatePermutation(List<Integer> current, List<Integer> remaining, List<List<Integer>> result) {
		if(remaining.isEmpty()) {
			result.add(new ArrayList<>(current));
			return;
		}
		for(int i=0; i<remaining.size(); i++) {
			int chosen = remaining.get(i);
			current.add(chosen);
			remaining.remove(i);
			
			generatePermutation(current, remaining, result);
			
			remaining.add(i, chosen);
			current.remove(current.size()-1);
		}
	}
	
	public static void main(String args[]) {
		List<Integer> arr = new ArrayList<>(List.of(1,2,3));
		List<List<Integer>> result = new ArrayList<>();
		
		generatePermutation(new ArrayList<>(), arr, result);
		
		for(List<Integer> permute : result) {
			System.out.println(permute);
		}
	}
}
