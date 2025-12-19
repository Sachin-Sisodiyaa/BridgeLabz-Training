/*Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
*/



import java.util.Scanner;

public class SwitchCalculator
{
	public static void main(String[] args)
	{
	
		// Taking inputs
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter the number 1: ");
		double first = input.nextDouble();
		System.out.print("Enter the number 2: ");
		double second = input.nextDouble();
		System.out.print("Enter the operator for calculation:  ");
		char operator = input.next().charAt(0);
	

		// Calculating operation using switch
		switch(operator)
		{
			case '+' : 
				System.out.println("Addition of number " + first + " and " + second + " is " + (first+second));
				break;
			case '-' : 
				System.out.println("Subtraction of number " + first + " and " + second + " is " + (first-second));
				break;
			case '*' : 
				System.out.println("Multiplication of number " + first + " and " + second + " is " + (first*second));
				break;
			case '/' : 
				System.out.println("Division of number " + first + " and " + second + " is " + (first/second));
				break;
			default :
				System.out.println("Invalid operator");
		}
		input.close();
	}

}
	