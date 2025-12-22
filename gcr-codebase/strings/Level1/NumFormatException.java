/*Write a program to demonstrate NumberFormatException
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/


import java.util.Scanner;
public class NumFormatException{
	
	//Gerenating NumFormatException
	public static int generateException(String str){
		int num = Integer.parseInt(str);
		return num;
	}

	//handle exception
	public static void handleException(String str){
		try{
			generateException(str);
		} 
		catch(NumberFormatException e){
			System.out.print("NumberFormatException handled successfully");
		}
		catch(RuntimeException e){
			System.out.print("GenericRuntimeException handled successfully");
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
