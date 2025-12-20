/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
*/



import java.util.Scanner;

public class BodyMassIndex
{	public static void main(String[] args)
	{
		//Take input And creating arrays
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of person:");
		int number = input.nextInt();
		
		double heightCm[] = new double[number];
		double heightM[] = new double[number];
        	double weight[] = new double[number];

        	System.out.print("Enter height of persons in cm: ");
        	for (int i = 0; i < number; i++) 
		{
            		heightCm[i] = input.nextDouble();
			heightM[i] = heightCm[i] / 100;
        	}

        	System.out.print("Enter weight of persons in kg: ");
        	for (int i = 0; i < number; i++) 
		{
            		weight[i] = input.nextDouble();
        	}

        	// Calculate BMI
        	double bmi[] = new double[number];
        	String status[] = new String[number];

        	for (int i = 0; i < number; i++) 
		{
            		bmi[i] = weight[i] / (heightM[i] * heightM[i]);

            		if (bmi[i] <= 18.4) 
			{
                		status[i] = "Underweight";
            		} 
			else if (bmi[i] <= 24.9) 
			{
                		status[i] = "Normal";
            		} 
			else if (bmi[i] <= 39.9) 
			{
                		status[i] = "Overweight";
            		} 
			else 
			{
                		status[i] = "Obese";
            		}
        	}

        	// Print results
        	for (int i = 0; i < number; i++) 
		{
            		System.out.println("Person " + (i + 1) + " Height: " + heightCm[i] + " Weight: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        	}

        	input.close();
    	}
}
