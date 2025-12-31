/* 11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks. */


import java.util.Scanner;

public class TemperatureLogger {

	//Method to find maximum temperature
	public static double findMaxTemperature(double temperatures[]){
		//Loop to find max temperature
		double max = temperatures[0]; 
		for(int s=0; s<7; s++){
			if(max < temperatures[s]){
				max = temperatures[s];
			}
		}
		return max;
	}

	//Method to calculate average temperature
	public static double findAvgTemperature(double temperatures[]){
		//Loop to find average of temperatures 
		double total = 0;
		for(int s=0; s<7; s++){
			total += temperatures[s];
		}
		double average = total / 7; 
		return average;
	}

	//Main method
	public static void main(String[] args) {
		//Variable declaration and initialization
		Scanner sc = new Scanner(System.in);
		double temperatures[] = new double[7];
		System.out.println("Enter temperatures of 7 days in celcius : ");
		for(int i=0; i<7; i++){
			temperatures[i] = sc.nextDouble();
		}
		
		//Method calling to get max and avg temperature
		double max = findMaxTemperature(temperatures);
		double average = findAvgTemperature(temperatures);	

		//
		System.out.println("Maximum temperature over 7 days is : " + max);
		System.out.println("Average temperature of 7 days is : " + average);

		sc.close();

	}
}
		