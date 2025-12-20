/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
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

        	int[] physics = new int[students];
        	int[] chemistry = new int[students];
        	int[] maths = new int[students];
        	double[] percentage = new double[students];
        	char[] grade = new char[students];

        	// Input marks
        	for (int i = 0; i < students; i++) {
            		System.out.println("\nEnter marks for Student " + (i + 1));

            		System.out.print("Physics: ");
            		int p = sc.nextInt();
            		if (p < 0) {
                		System.out.println("Marks must be positive. Re-enter student data.");
                		i--;
                		continue;
            		}

            		System.out.print("Chemistry: ");
            		int c = sc.nextInt();
            		if (c < 0) {
                		System.out.println("Marks must be positive. Re-enter student data.");
                		i--;
                		continue;
            		}

            		System.out.print("Maths: ");
            		int m = sc.nextInt();
            		if (m < 0) {
                		System.out.println("Marks must be positive. Re-enter student data.");
                		i--;
                		continue;
            		}

            		physics[i] = p;
            		chemistry[i] = c;
            		maths[i] = m;

            		percentage[i] = (p + c + m) / 300.0 * 100;

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

        	// Display Report
        	System.out.println("\n Students report : ");
        	for (int i = 0; i < students; i++) {
            		System.out.println("\nStudent " + (i + 1));
            		System.out.println("Physics: " + physics[i]);
            		System.out.println("Chemistry: " + chemistry[i]);
            		System.out.println("Maths: " + maths[i]);
            		System.out.println("Percentage: " + percentage[i]);
            		System.out.println("Grade: " + grade[i]);
        	}

        	sc.close();
    	}
}


			
			





