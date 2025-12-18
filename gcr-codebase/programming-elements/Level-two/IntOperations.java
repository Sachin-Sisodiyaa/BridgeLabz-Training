/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, and c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign the result to a variable
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___
*/



import java.util.Scanner;
public class IntOperation
{
	public static void main(String [] args )
	{
		//Creating variables to store numbers
		int a, b, c;
		int operation1, operation2, operation3, operation4;
	
		//Creating object for scanner class
		Scanner input = new Scanner(System.in);

		//Taking input from user
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();

		//Perform int operations
		operation1 = a + b *c;
		operation2 = a * b + c;
		operation3 = c + a / b;
		operation4 = a % b + c;
	
		// Display the outputs
		System.out.print("The results of Int Operations are " + operation1 + " , " + operation2 + " , " + operation3 + " and " + operation4);
		input.close();
	}

}
