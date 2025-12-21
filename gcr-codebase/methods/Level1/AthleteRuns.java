/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/


import java.util.Scanner;
public class AthleteRuns{
	
	float athleteRuns(float side1, float side2, float side3){
		float perimeter = (side1 + side2 + side3);
		float round = 5000/perimeter;
		return round;
	}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first side :");
		float side1 = sc.nextFloat();
		System.out.print("Enter second side :");
		float side2 = sc.nextFloat();
		System.out.print("Enter third side :");
		float side3 = sc.nextFloat();

				
		//object of method
		AthleteRuns obj = new AthleteRuns();
	
		//calling
		float result = obj.athleteRuns(side1,side2,side3);

		//print result
		System.out.println("Number of round : " + Math.ceil(result));
		
		sc.close();
	}
}