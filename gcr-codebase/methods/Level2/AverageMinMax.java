/*Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers) 
*/



import java.util.Scanner;
public class AverageMinMax{
	
	//Method to generate 4 digit random numbers 
	public int[] generate4DigitRandomArray(int size){
		int number[] = new int[size];
		for(int i=0; i<size; i++){
			number[i] = (int) (Math.random() * 9000) + 1000;
		}
		return number; 	
	}
	
	//Method to find AverageMinMax
	public double[] findAverageMinMax(int[] randomNumbers){
		int min = randomNumbers[0]; 
		int max = randomNumbers[0];
		int sum = 0; 
		for (int num : randomNumbers){ 
			sum += num; 
			if (num < min){
				min = num; 
			} 
			if (num > max){ 
				max = num; 
			}
		}
		double average = (double) sum / randomNumbers.length;	
		return new double[]{average, min, max};
	}


	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of an array :");
		int size = sc.nextInt();
				
		//creating object
		AverageMinMax obj = new AverageMinMax();
			
		//calling method 1
		int randomNumbers[] = obj.generate4DigitRandomArray(size);	

		//calling method 2
		double averageMinMax[] = obj.findAverageMinMax(randomNumbers);	

		System.out.println("Average , Min, Max of random 4 digit numbers are : ");	
		System.out.println("Average : " + averageMinMax[0] + " Min : " + averageMinMax[1] + " Max : " + averageMinMax[2]);
		
		sc.close();
	}
}