/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
*/




import java.util.Random;
import java.util.Scanner;

public class StudentReport {

    // Method to generate random 2-digit PCM scores for students
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(51) + 50; 
            scores[i][1] = rand.nextInt(51) + 50; 
            scores[i][2] = rand.nextInt(51) + 50; 
        }

        return scores;
    }

    // Method to calculate Total, Average, Percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {

        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {

            double percentage = results[i][2];

            if (percentage >= 90)
                grades[i] = "A+";
            else if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }

        return grades;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t\t%\t\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t\t" +
                    results[i][2] + "\t\t" +
                    grades[i]
            );
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);

        sc.close();
    }
}
