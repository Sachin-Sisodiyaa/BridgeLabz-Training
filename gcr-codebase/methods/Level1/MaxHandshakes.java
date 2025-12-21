/*Create a program to find the maximum number of handshakes among students.
Hint => 
Get integer input for the numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Display the number of possible handshakes.
*/



import java.util.Scanner;
public class MaxHandshakes{
	
	int handShakes(int numberOfStudents){
		int combination = (numberOfStudents * (numberOfStudents -1)) /2;
		return combination;
	}
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of students :");
		int numberOfStudents = sc.nextInt();
				
		//object of method
		MaxHandshakes obj = new MaxHandshakes();
	
		//calling
		int result = obj.handShakes(numberOfStudents);

		//print result
		System.out.println("Number of students : " + result);
		
		sc.close();
	}
}