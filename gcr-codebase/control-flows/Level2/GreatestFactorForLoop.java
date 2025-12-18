/*Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/


import java.util.Scanner;

//program to find greatest factor using for loop
public class GreatestFactorForLoop
{
	public static void main(String[] args)
	{
		//Object of scanner class and taking input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		int greatestFactor = 1;

		//Condition + loop for find result
		for(int check=number-1; check>1; check--)
		{
			if(number % check == 0)
			{
				greatestFactor = check;
				break;
			}
		}

		//Print result
		System.out.println("Greatest Factor of number : " + number + " is : " + greatestFactor);
		input.close();
	}
}