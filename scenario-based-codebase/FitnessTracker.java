/*Problem 2: Maya’s BMI Fitness Tracker

Maya is a fitness coach who wants to calculate BMI for her clients.

Write a Java program that takes height and weight as input, calculates BMI using the formula BMI = weight / (height * height), and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. Use meaningful variable names and proper comments to maintain clean code.
*/




import java.util.Scanner;

public class FitnessTracker{

	//Method to calculate BMI
	public static double calculateBMI(int height, int weight){
		double bmi = weight / ((height * height) / 100); 
		return bmi;
	}

	public static void main(String[] args){
		
	//Taking Inputs
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter height in cm : ");
	int height = sc.nextInt();
	System.out.print("Enter weight in kg : ");
	int weight = sc.nextInt();

	double bmi = calculateBMI(height,weight);
	
	//condition to print result
	if(bmi <= 18.4){
		System.out.println("Underweight");
	}
	else if(bmi >= 18.5 && bmi <= 24.9){
		System.out.println("Normal");
	}
	else if(bmi >=25.0 && bmi <= 39.9){
		System.out.println("Overweight");
	}
	else{
		System.out.println("Obese");
	}

	sc.close();
	}
}

