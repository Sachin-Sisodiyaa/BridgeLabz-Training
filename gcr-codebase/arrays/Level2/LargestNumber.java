/*Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/ 




import java.util.Scanner;

public class LargestNumber
{	public static void main(String[] args)
	{
		//Take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number :");
		long number = input.nextLong();
		int maxDigit = 10;
		long digits[] = new long[maxDigit];
		int index = 0;
		while(number > 0)
		{	
			if (index == maxDigit) 
			{
                		maxDigit += 10;                
				long[] temp = new long[maxDigit];

                		for (int i = 0; i < digits.length; i++) 
				{
                    			temp[i] = digits[i];
                		}
                	digits = temp; 	            		
			}
			digits[index] = number % 10;
			index++;
			number /= 10;
		}
		
		//Logic for finding largest and second largest
		long largest = 0; 
		for(int i=0; i<maxDigit; i++)
		{
			if(digits[i] >largest)
			{
				largest = digits[i];
			}
		}

		long secondLargest = 0; 
		for(int i=0; i<maxDigit; i++)
		{
			if(digits[i] < largest && digits[i] > secondLargest)
			{
				secondLargest = digits[i];
			}
		}

		//printing results		
		System.out.println("Largest number is : " + largest);
        	System.out.println("Second Largest number is : " + secondLargest);
		
		input.close();
	}
}
