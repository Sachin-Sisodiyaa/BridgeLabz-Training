/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint = 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/

import java.util.Scanner;
public class ChocolatesDistribution{
	
		public static int[] chocolatesDistribution(int numberOfChocolates, int numberOfChildrens){
		
			int chocolatePerEach = 0;
			int remaining = 0;
			chocolatePerEach = numberOfChocolates / numberOfChildrens;
			remaining = numberOfChocolates % numberOfChildrens;
			return new int[]{chocolatePerEach,remaining};
		}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		int num[] = new int[3]; 
		System.out.print("Enter number of childrens :");
		int numberOfChildrens = sc.nextInt();
		System.out.print("Enter number of chocolates :");
		int numberOfChocolates= sc.nextInt();
				 		
		//calling
		int result[] = ChocolatesDistribution.chocolatesDistribution(numberOfChocolates, numberOfChildrens);

		//print resilt	
		System.out.println("Chocolates per each : " + result[0]);
		System.out.println("Remaining is : " + result[1]);
			
		sc.close();
	}
}