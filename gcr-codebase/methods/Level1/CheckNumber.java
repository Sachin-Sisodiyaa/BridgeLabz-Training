/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/

import java.util.Scanner;
public class CheckNumber{
	
	int checkNumber(int number){
		if(number > 0){
			return 1;			
		}
		else if(number < 0){
			return -1;			
		}
		else{
			return 0;			
		}


	}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number :");
		int number = sc.nextInt();
				
		//object of method
		CheckNumber obj = new CheckNumber();
	
		//calling
		int result = obj.checkNumber(number);	

		System.out.println(result);		
	
		sc.close();
	}
}