/*Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/


import java.util.Scanner;

public class CompareStrings{
	
	//Method to compare strings using in-built charAt() method
	public static Boolean compareWithCharAt(String str1, String str2){
		if(str1.length() == str2.length()){
			for(int i=0; i<str1.length(); i++){
				if(str1.charAt(i) == str2.charAt(i)){
					return true;
				}
			}
		}
		return false;
	}
		
	//Method to commpare strings using in-built equals() method
	public static Boolean compareWithEquals(String str1, String str2){
		if(str1.equals(str2)){
			return true;
		}
		return false;
	}

	//Main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();

		if(compareWithCharAt(str1,str2) && compareWithEquals(str1,str2)){
			System.out.println("Strings are Equal");
		}
		else{
			System.out.println("Strings are NOT Equal");
		}

		sc.close();
	}
}