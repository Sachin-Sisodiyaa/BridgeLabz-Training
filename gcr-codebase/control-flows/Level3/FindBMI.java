/*Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/



import java.util.Scanner;

//Program to BMI status based on height and weight
public class FindBMI
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Weight : ");
		float weight = input.nextFloat();
		System.out.print("Enter Height : ");
		float height = input.nextFloat();
		float heightMeter = height / 100; 

		//calculate BMI
		float bmi = weight / (heightMeter * heightMeter);

		//Conditions and printing result
		if(bmi <=18.4)
		{
			System.out.println("Your weight status is : Underweight");
		}
		else if(bmi >= 18.5 && bmi <=24.9)
		{
			System.out.println("Your weight status is : Normal");
		}
		else if(bmi >= 25.0 && bmi <= 39.9)
		{
			System.out.println("Your weight status is : Overweight");
		}
		else
		{
			System.out.println("Your weight status is : Obese");
		}
		input.close();
	}
}
	