/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
*/




import java.util.Scanner;

public class BodyMassIndex {

    // Method to calculate BMI and store it in array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];       
            double heightCm = data[i][1];     
            double heightM = heightCm / 100;  
            data[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        // Input weight & height
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details of person " + (i + 1));
            System.out.print("Enter weight kg: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height cm: ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Get BMI status
        String[] status = getBMIStatus(data);

        // Display results
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson "+ (i + 1) + " Weight : " + data[i][0] + " Height : " + data[i][1] + " BMI : " + data[i][2] + " Status : " + status[i]);
        }

        sc.close();
    }
}
