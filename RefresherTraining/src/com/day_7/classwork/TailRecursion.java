package com.day_7.classwork;
import java.util.Scanner;

public class TailRecursion {
	
	public static void tailRecursion(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n + " ");
		tailRecursion(n-1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		tailRecursion(n);
	}
}
