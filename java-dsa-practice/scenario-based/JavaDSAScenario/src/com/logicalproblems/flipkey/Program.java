package com.logicalproblems.flipkey;

import java.util.Scanner;

public class Program {
	
	public static String cleanseAndInvert(String str) {
		if(str == null || str.length() < 6) {
			return" ";
		}
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
			    return" "; 
			}
		}
		
		str = str.toLowerCase();
		String key = "";
	
		for(int i = str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			if(ch % 2 != 0) {
				if(key.length()%2 == 0) {
					key += Character.toUpperCase(ch);	
				}
				else {
					key += ch;
				}
			} 
		 }
		return key;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Input String: ");
		String str = sc.nextLine();
		
		String result = cleanseAndInvert(str);
		
		if(result.equals(" ")) {
			System.out.println("\nInvalid Input");
		}
		else {
			System.out.println("Generated key ---> " + result);
		}
		
		sc.close();
	}

}
