//Rewrite program 8 to do the countdown using the for-loop



import java.util.Scanner;

//Program for count down using for loop
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
				
		//For loop for counting and print the count
		for(int counter=number; counter>0; counter--){
			System.out.println(counter);
		}
		
		//closing scanner
		input.close();
	}
}