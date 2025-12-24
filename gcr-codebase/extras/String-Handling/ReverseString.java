/*Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions.*/


import java.util.Scanner;

public class ReverseString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter String : ");
		String str = sc.nextLine();
		String rev = "";
		for(int i=str.length()-1; i>=0; i--){
			rev += str.charAt(i);			
		}
		System.out.print(" String : " + str + "\n" + " Reverse String : " + rev);
		
		sc.close();
	}
}