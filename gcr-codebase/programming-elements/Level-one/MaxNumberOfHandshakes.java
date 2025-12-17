/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/



import java.util.Scanner;
public class MaxNumberOfHandshakes
{
	public static void main(String[] args)
	{
		//Declare variable for no. of student
		int numberOfStudents, possibleHandshakes;
		
		
		//Taking input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students");
		numberOfStudents = input.nextInt();

		//Finding number of possible handshakes
		possibleHandshakes = (numberOfStudents * (numberOfStudents - 1))/2;

		//Display maximum number of possible handshakes
		System.out.println("The number of possible handshakes is " + possibleHandshakes);
		input.close();
		}
}


