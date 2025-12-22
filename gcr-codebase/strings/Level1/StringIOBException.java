/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;
public class StringIOBException{
	
	//Gerenating StringIndexOutOfBoundsException
	public static Boolean generateException(String str){
		System.out.println(str.charAt(str.length() + 10));
		return true;
	}

	//handle exception
	public static void RuntimeException(String str){
		try{
			generateException(str);
		} 
		catch(StringIndexOutOfBoundsException e){
			System.out.print("StringIndexOutOfBoundsException handled successfully");
		}
	}

	//Main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		try {
            		generateException(str);
        	}
        	catch (Exception e) {
            		System.out.println("Exception generated and program stopped abruptly");
        	}

        	//Calling method to handle exception
        	handleException(str);
		sc.close();
	}
}
