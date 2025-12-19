/* Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
*/



import java.util.Scanner;

//Program to find marks, percentage and remark of a student
public class MarksReport
{
	public static void main(String[] args)
	{
		//Creating object of scanner class and take input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter physics marks : ");
		double physics = input.nextDouble();
		System.out.print("Enter chemistry marks : ");
		double chemistry = input.nextDouble();
		System.out.print("Enter maths marks : ");
		double math = input.nextDouble();

		//calculating average marks and percentage
		double percentage = (physics + chemistry + math) / 300 * 100;
 		double average = (physics + chemistry + math) / 3;

		
		//Conditions and printing result
		if(percentage >= 80)
		{
			System.out.println("Average Marks : " + average + " Grade : A  Remark : Level 4, above agency-normalized standards");
		}
		 else if(percentage >= 70 && percentage <= 79)
		{
			System.out.println("Average Marks : " + average + " Grade : B  Remark : Level 3, at agency-normalized standards");
		}
		else if(percentage >= 60 && percentage <= 69)
		{
			System.out.println("Average Marks : " + average + " Grade : C  Remark : Level 2, below, but apperoaching agency-normalized standards");
		}
		else if(percentage >= 50 && percentage <= 59)
		{
			System.out.println("Average Marks : " + average + " Grade : D  Remark : Level 1, well below agency-normalized standards");
		}
		else if(percentage >= 40 && percentage <= 49)
		{
			System.out.println("Average Marks : " + average + " Grade : E  Remark : Level 1, too below agency-normalized standards");
		}
		else
		{
			System.out.println("Average Marks : " + average + " Grade : R  Remark : (Remedial standard)");
		}
		input.close();
	}
}
	