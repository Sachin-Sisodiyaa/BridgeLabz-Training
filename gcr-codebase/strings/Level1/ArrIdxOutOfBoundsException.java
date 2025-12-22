/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/



import java.util.Scanner;
public class ArrIdxOutOfBoundsException{
	
	//Gerenating ArrayIndexOutOfBoundsException
	public static int generateException(int arr[]){
		System.out.println(arr[arr.length + 10]);
		return 0;
	}

	//handle exception
	public static void handleException(int arr[]){
		try{
			generateException(arr);
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("ArrayIndexOutOfBoundsException handled successfully");
		}
		catch(Exception e){
			System.out.print("GenericRuntimeException handled successfully");
		}
	}

	//Main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array elements: ");
		int arr[] = new int[5];
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		try {
            		generateException(arr);
        	}
        	catch (Exception e) {
            		System.out.println("Exception generated and program stopped abruptly");
        	}

        	//Calling method to handle exception
        	handleException(arr);
		sc.close();
	}
}
