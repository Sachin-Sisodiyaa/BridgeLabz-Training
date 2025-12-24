/*3. Palindrome String Check
Problem:
Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).*/


import java.util.Scanner;

public class PalindromeString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter String : ");
		String str = sc.nextLine();
		Boolean isPalindrome = true;
		int start = 0, end = str.length()-1;
		while(start < end){
			if(str.charAt(start) == str.charAt(end)){		
				isPalindrome = true;
			}
			
			start++;
			end--;
		}
		if(isPalindrome){
			System.out.print(" String : " + str + " is" + " palindrome");
		}
		else{
			System.out.print(" String : " + str + " is" + " Not Palindrome");
		}
		sc.close();
	}
}