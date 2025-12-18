/*Similarly, write the DoubleOpt program by taking double values and doing the same operations.*/



import java.util.Scanner;
public class DoubleOperation
{
	public static void main(String [] args )
	{
		//Creating variables to store numbers
		double a, b, c;
		double operation1, operation2, operation3, operation4;
	
		//Creating object for scanner class
		Scanner input = new Scanner(System.in);

		//Taking input from user
		System.out.print("Enter a : ");
		a = input.nextDouble();
		System.out.print("Enter b : ");
		b = input.nextDouble();
		System.out.print("Enter c : ");
		c = input.nextDouble();

		//Perform int operations
		operation1 = a + b *c;
		operation2 = a * b + c;
		operation3 = c + a / b;
		operation4 = a % b + c;
	
		// Display the outputs
		System.out.print("The results of Double Operations are " + operation1 + " , " + operation2 + " , " + operation3 + " and " + operation4);
		input.close();
	}

}
