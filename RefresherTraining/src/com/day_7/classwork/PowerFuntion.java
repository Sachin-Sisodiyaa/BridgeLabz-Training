package com.day_7.classwork;
import java.util.Scanner;

public class PowerFuntion {
	
	public static int powerFunction(int n, int exp) {
		if(exp==0) {
			return 1;
		}
		return n*powerFunction(n, exp-1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int exp = sc.nextInt();
		
		int result = powerFunction(n, exp);
		
		System.out.println(result);
		
		sc.close();
	}

}
