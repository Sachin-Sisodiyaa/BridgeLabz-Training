/*1. Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.*/


import java.util.Scanner;

public class CountVowelsConsonants{
	public static void main(String[] args){
		
		//Taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		int vowel = 0, consonant = 0;

		//Loop & Condition to check and count vowels and consonants
		for(int i=0; i<str.length(); i++){
		char ch = str.charAt(i);
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
				vowel++;
			}
			else{
				consonant++;
			}
		}
		
		//Resuult
		System.out.print(" Vowels : " + vowel + "\n" + " Consonants : " + consonant);
		
		sc.close();
	}
}