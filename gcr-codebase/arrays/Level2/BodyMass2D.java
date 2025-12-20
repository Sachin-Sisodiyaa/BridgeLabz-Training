import java.util.Scanner;

public class BodyMass2D
{	public static void main(String[] args)
	{
		//Take input And creating arrays
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of person:");
		int number = input.nextInt();
		
		// Taking input height and weight 
        	double[][] personData = new double[number][3];
        	String[] status = new String[number];
        
        	for (int i = 0; i < number; i++) 
		{
            		System.out.println("Enter details for person " + (i + 1));

            		System.out.print("Height in cm: ");
            		personData[i][0] = input.nextDouble();

            		System.out.print("Weight in kg: ");
            		personData[i][1] = input.nextDouble();

            		// Convert height to meters and calculate BMI
            		double heightMeter = personData[i][0] / 100;
            		personData[i][2] = personData[i][1] / (heightMeter * heightMeter);

            		//Store BMI status
            		if (personData[i][2] <= 18.4) 
			{
                		status[i] = "Underweight";
            		} 		
			else if (personData[i][2] <= 24.9) 
			{
                		status[i] = "Normal";
            		} 		
			else if (personData[i][2] <= 39.9) 
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
            		System.out.println("Person " + (i + 1) + " Height: " + personData[i][0] + " Weight: " + personData[i][1] + " BMI: " + personData[i][2] + " Status: " + status[i]);
        	}

        	input.close();
    	}
}
