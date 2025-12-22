/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result
*/



import java.util.Scanner;

public class ConvertTextCaseTwo{
	
	//Method to convert string lowercase using charAt() method
	public static String lowercaseWithCharAt(String str){
		String s1 = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
        		if (ch >= 'A' && ch <= 'Z') {
            			ch = (char)(ch + 32);
        		}

        		s1 += ch;
		}
		return s1;
	}
	
	//Method to convert string lowercase using toLowerCase() method	
	public static String getToLowerCase(String str){
		String result = str.toLowerCase();
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
		String s1 = getToLowerCase(str);
		String s2 = lowercaseWithCharAt(str);

		//Print result
		System.out.println("String with toLowerCase method is : " + s1);
		System.out.println("LowerCase Strings with user-define charAt : " + s2);
		System.out.println("LowerCase String with both method are Equal : " + compare(s1,s2));
		sc.close();
	}
}