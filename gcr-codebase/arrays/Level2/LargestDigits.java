/*Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
*/




import java.util.Scanner;

public class LargestDigits
{	public static void main(String[] args)
	{
		//Take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number :");
		long number = input.nextLong();
		int maxDigit = 10;
		long digit[] = new long[maxDigit];
		int index = 0;
		while(number > 0)
		{	
			if (index == maxDigit) {
                		break;
            		}
			digit[index] = number % 10;
			index++;
			number /= 10;
			
		}
		
		//Logic for finding largest and second largest
		long largest = 0; 
		for(int i=0; i<maxDigit; i++)
		{
			if(digit[i] >largest)
			{
				largest = digit[i];
			}
		}

		long secondLargest = 0; 
		for(int i=0; i<maxDigit; i++)
		{
			if(digit[i] < largest && digit[i] > secondLargest)
			{
				secondLargest = digit[i];
			}
		}

		//printing results		
		System.out.println("Largest number is : " + largest);
        	System.out.println("Second Largest number is : " + secondLargest);
		
		input.close();
	}
}
