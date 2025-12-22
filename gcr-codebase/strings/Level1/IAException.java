/*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/


import java.util.Scanner;
public class IAException{
	
	//Gerenating IllegalArgumentException
	public static String generateException(String str, int start, int end){
		String sub = str.substring(start,end);
		return sub;
	}

	//handle exception
	public static void handleException(String str, int start, int end){
		try{
			generateException(str, start, end);
		} 
		catch(IllegalArgumentException e){
			System.out.print("IllegalArgumentException handled successfully");
		}
		catch(Exception e){
			System.out.print("GenericRuntimeException handled successfully");
		}
	}

	//Main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		System.out.println("Enter start index");
		int start = sc.nextInt();
		System.out.println("Enter end index");
		int end = sc.nextInt();

		try {
            		generateException(str, start, end);
        	}
        	catch (Exception e) {
            		System.out.println("Exception generated and program stopped abruptly");
        	}

        	//Calling method to handle exception
        	handleException(str, start, end);
		sc.close();
	}
}
