/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/


import java.util.Scanner;
public class SimpleInterest{
	
	float simpleInterest(float principle, float rate, float time){
		float si = (principle * rate * time) / 100;
		return si;
	}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter principle amount :");
		float principle = sc.nextFloat();
		System.out.print("Enter rate :");
		float rate = sc.nextFloat();
		System.out.print("Enter time :");
		float time = sc.nextFloat();
 		
		//object of method
		SimpleInterest obj = new SimpleInterest();
	
		//calling
		float result = obj.simpleInterest(principle, rate, time);

		//print result
		System.out.println("Simple Interest is : " + result);
		
		sc.close();
	}
}