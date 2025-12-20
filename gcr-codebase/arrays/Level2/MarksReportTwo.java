/*Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
*/


import java.util.Scanner;

public class MarksReport
{
	public static void main(String[] args)
	{
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        	int students = sc.nextInt();

        	int marks[][] = new int[students][3];
        	double[] percentage = new double[students];
        	char[] grade = new char[students];

        	for (int i = 0; i < students; i++) {
            		System.out.println("\nEnter marks for Student " + (i + 1));

            		for (int j = 0; j < 3; j++) {

                		if (j == 0)
                    		System.out.print("Physics: ");
                		else if (j == 1)
                    		System.out.print("Chemistry: ");
                		else
                    		System.out.print("Maths: ");

                		int value = sc.nextInt();

                		// checking negative marks 
                		if (value < 0) {
                    			System.out.println("Marks must be >= 0  Re-enter this student's data.");
                    			i--;            
                    			break;
                		}

                		marks[i][j] = value;
            		}

             			int total = marks[i][0] + marks[i][1] + marks[i][2];
            			percentage[i] = total / 300.0 * 100;

            			if (percentage[i] >= 80)
                			grade[i] = 'A';
            			else if (percentage[i] >= 70)
                			grade[i] = 'B';
            			else if (percentage[i] >= 60)
                			grade[i] = 'C';
            			else if (percentage[i] >= 50)
                			grade[i] = 'D';
            			else if (percentage[i] >= 40)
                			grade[i] = 'E';
            			else
                			grade[i] = 'R';
        	}

        	// Printing report
        	System.out.println("\n Students report : ");
        	for (int i = 0; i < students; i++) {
            		System.out.println("\nStudent " + (i + 1));
            		System.out.println("Physics: " + marks[i][0]);
            		System.out.println("Chemistry: " + marks[i][1]);
            		System.out.println("Maths: " + marks[i][2]);
            		System.out.println("Percentage: " + percentage[i]);
            		System.out.println("Grade: " + grade[i]);
        	}

        	sc.close();
    	}
}

