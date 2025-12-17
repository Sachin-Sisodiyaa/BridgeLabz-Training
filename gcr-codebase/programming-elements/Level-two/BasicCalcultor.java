/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/

import java.util.Scanner;
public class BasicCalcultor
{
	public static void main(String[] args)
	{
		//Declare number variables to store two values
		float number1, number2;
		float addition, subtraction, multiplication, division; 
		
		//creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking inputs from user
		System.out.println("Enter first number");
		number1 = input.nextFloat();
		System.out.println("Enter second number");
		number2 = input.nextFloat();

		//calculating results
		addition = number1 + number2;
		subtraction = number1 - number2;
		multiplication = number1 * number2;
		division = number1 / number2;

		//Display results in a single line
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + " " + subtraction +  " " + multiplication + " and " + division);
	}
}

		