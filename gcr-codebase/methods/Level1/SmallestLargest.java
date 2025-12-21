/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/



import java.util.Scanner;
public class SmallestLargest{
	
		public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		
			int smallest = number1;
			int largest = number1;
			if(number2 < smallest){
				smallest = number2;
			}
			if(number3 < smallest){
				smallest = number3;
			}
			if(number2 > largest){
				largest = number2;
			}
			if(number3 > largest){
				largest = number3;
			}
			return new int[]{smallest,largest};
		}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		int num[] = new int[3]; 
		System.out.print("Enter number 1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2 :");
		int num2 = sc.nextInt();
		System.out.print("Enter number 3 :");
		int num3 = sc.nextInt();

		 		
		//object of method
		SmallestLargest obj = new SmallestLargest();
	
		//calling
		int result[] = obj.findSmallestAndLargest(num1,num2,num3);

		//print resilt	
		System.out.println("Smallest number is : " + result[0]);
		System.out.println("Largest number is : " + result[1]);
			
		sc.close();
	}
}