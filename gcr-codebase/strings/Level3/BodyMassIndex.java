/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/



import java.util.Scanner;

public class BodyMassIndex {

    // Method to calculate BMI and Status for one person
    public static String[] calculateBMIStatus(double weight, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // BMI formula
        double bmi = weight / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        String[] result = {
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.valueOf(bmi),
                status
        };

        return result;
    }

    // Method to compute BMI for all persons
    public static String[][] computeAllBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            String[] bmiData = calculateBMIStatus(data[i][0], data[i][1]);

            result[i][0] = bmiData[0]; 
            result[i][1] = bmiData[1]; 
            result[i][2] = bmiData[2]; 
            result[i][3] = bmiData[3]; 
        }

        return result;
    }

    // Method to display BMI table
    public static void displayTable(String[][] data) {

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t\t" +
                    data[i][3]
            );
        }
        System.out.println("-------------------------------------------------------------");
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] input = new double[10][2];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            input[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            input[i][1] = sc.nextDouble();
        }

        String[][] result = computeAllBMI(input);
        displayTable(result);

        sc.close();
    }
}
