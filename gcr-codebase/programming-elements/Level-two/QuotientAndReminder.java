/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/


import java.util.Scanner;
public class QuotientAndReminder
{
	public static void main(String[] args)
	{
		//Creating variables to store number 1 & number 2
		int numberOne, numberTwo;
		int quotient, reminder;

		//Creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking inputs from user
		System.out.println("Enter first number");
		numberOne = input.nextInt();
		System.out.println("Enter second number");
		numberTwo = input.nextInt();

		//Calculate quotient and reminder
		quotient = numberOne / numberTwo;
		reminder = numberOne % numberTwo;

		//Displaying the outputs in single line
		System.out.println("The Quotient is "+ quotient + " and Reminder is " + reminder + " of two number " + numberOne + " and " + numberTwo);
		input.close();
	}
}
 