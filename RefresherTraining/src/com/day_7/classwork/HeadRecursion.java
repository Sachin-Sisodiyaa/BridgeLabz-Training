package com.day_7.classwork;
import java.util.Scanner;

public class HeadRecursion {
	
	public static void headRecursion(int n) {
		if(n==0) {
			return;
		}
		headRecursion(n-1);
		System.out.print(n + " ");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		headRecursion(n);
	}
}
