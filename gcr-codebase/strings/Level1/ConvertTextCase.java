/*Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result
*/




import java.util.Scanner;

public class ConvertTextCase{
	
	//Method to convert string uppercase using charAt() method
	public static String uppercaseWithCharAt(String str){
		String s1 = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
        		if (ch >= 'a' && ch <= 'z') {
            			ch = (char)(ch - 32);
        		}

        		s1 += ch;
		}
		return s1;
	}
	
	//Method to convert string uppercase using toUpperCase() method	
	public static String getToUpperCase(String str){
		String result = str.toUpperCase();
		return result;
	}

	//Method to compare two strings
	public static Boolean compare(String s1, String s2){
		if(s1.equals(s2)){
			return true;
		}
		return false;
	}
		

	public static void main(String[] args){
		//Taking Inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
	
		//Calling methods
		String s1 = getToUpperCase(str);
		String s2 = uppercaseWithCharAt(str);

		//Print result
		System.out.println("String with toUpperCase method is : " + s1);
		System.out.println("UpperCase Strings with user-define charAt : " + s2);
		System.out.println("UpperCase String with both method are Equal : " + compare(s1,s2));
		sc.close();
	}
}