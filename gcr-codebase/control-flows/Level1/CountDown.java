/* Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.
*/


import java.util.Scanner;

//Program for count down using while loop
public class CountDown
{
	public static void main(String[] args)
	{
		//Variable declaration
		int number;

		//Creating object of scanner class and taking user input
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter number : ");
		number = input.nextInt();
		
		//initializing counter
		int counter = number;
		
		//While loop for counting
		while(counter>0){
			System.out.println(counter);
			counter--;
		}
		
		//closing scanner
		input.close();
	}
}