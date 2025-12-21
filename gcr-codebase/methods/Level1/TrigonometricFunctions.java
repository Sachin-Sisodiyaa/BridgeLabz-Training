/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/


import java.util.Scanner;
public class TrigonometricFunctions{
	
	//Method to calculate 
	public double[] calculateTrigonometricFunctions(double angle){
		double  angleRadians = Math.toRadians(angle);
		double sine = Math.sin(angleRadians);
            	double cosine = Math.cos(angleRadians);
            	double tangent = Math.tan(angleRadians);
		return new double[]{sine,cosine,tangent}; 	
	}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter angle value :");
		double angle = sc.nextDouble();
				
		//creating object
		TrigonometricFunctions obj = new TrigonometricFunctions();
			
		//calling
		double result[] = obj.calculateTrigonometricFunctions(angle);	

		System.out.println("Result of trigonometric functions for angle : " + angle +  " is sine : " + result[0] + " cosine : " + result[1] + " and tangent : " + result[2]);	
	
		sc.close();
	}
}