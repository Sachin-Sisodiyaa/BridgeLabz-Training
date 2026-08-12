package com.day_7.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class DevisStaircase {
//	static int stepPerms(int n) {
//	    if (n == 0) return 0;
//	    if (n == 1) return 1;
//	    if (n == 2) return 2;
//	    if (n == 3) return 4;
//
//	    int a = 1, b = 2, c = 4; 
//	    int res = 0;
//	    for (int i = 4; i <= n; i++) {
//	        res = a + b + c;
//	        a = b;
//	        b = c;
//	        c = res;
//	    }
//	    return res;
//	}
	
	static long[] memo;
	
	public static int stepPerms(int n) {
		memo = new long[n+1];
		Arrays.fill(memo, -1);
		return (int) solve(n);
	}
	
	public static long solve(int n) {
		if(n==0) 
			return 1;
		if(n<0)
			return 0;
		
		if(memo[n] != -1) 
			return memo[n];
		
		return memo[n] = solve(n-1) + solve(n-2) + solve(n-3);
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(stepPerms(n));
	}
}
