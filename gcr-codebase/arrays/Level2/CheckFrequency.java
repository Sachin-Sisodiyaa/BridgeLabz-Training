/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/



import java.util.Scanner;

public class CheckFrequency
{
	public static void main(String[] args)
	{
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
        	int originalNumber = sc.nextInt();
		int number = originalNumber;
		int count = 0;
		
		//Counting digits and crating digits array
		while(number > 0){
			count++;
			number /= 10;
		}
		number = originalNumber;
		int[] digits = new int[count];
		for(int i=0; i<count; i++){
			digits[i] = number % 10;
			number /= 10;
		}

		//storing frequency
		int freq[] = new int[10];
		for(int i=0; i<count; i++){
			int idx = digits[i];
			freq[idx] += 1;
		}

		//print frequency
		for(int i=0; i<10; i++){
			System.out.print("\nFrequency of number " + i + " = " + freq[i]);
		}


        	sc.close();
    	}
}


		
