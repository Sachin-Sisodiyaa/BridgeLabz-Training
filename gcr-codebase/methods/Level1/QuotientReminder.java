/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/



import java.util.Scanner;
public class QuotientReminder{
	
		public static int[] findRemainderAndQuotient(int number, int divisor){
		
			int quotient = 0;
			int reminder = 0;
			quotient = number / divisor;
			reminder = number % divisor;
			return new int[]{quotient,reminder};
		}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		int num[] = new int[3]; 
		System.out.print("Enter number 1 :");
		int number = sc.nextInt();
		System.out.print("Enter number 2 :");
		int divisor = sc.nextInt();
				 		
		//calling
		int result[] = QuotientReminder.findRemainderAndQuotient(number, divisor);

		//print resilt	
		System.out.println("Quotient is : " + result[0]);
		System.out.println("Remainder is : " + result[1]);
			
		sc.close();
	}
}