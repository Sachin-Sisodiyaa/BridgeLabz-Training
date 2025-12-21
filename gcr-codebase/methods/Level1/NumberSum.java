/* Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/

import java.util.Scanner;
public class NumberSum{
	
	//Method to calculate sum
	public static int numberSum(int number){
		int sum =0;
		for(int i=1; i<=number; i++){
			sum += i;
		}
		return sum; 	
	}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number :");
		int number = sc.nextInt();
					
		//calling
		int result = NumberSum.numberSum(number);	

		System.out.println("Total of n Natural numbers : " + result);		
	
		sc.close();
	}
}