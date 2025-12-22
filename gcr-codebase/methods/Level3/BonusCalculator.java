/*Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/


import java.util.Scanner;

public class BonusCalculator {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; 

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; 
            data[i][1] = (int)(Math.random() * 10) + 1;       
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate;

            if (years > 5) {
                bonusRate = 0.05; 
            } else {
                bonusRate = 0.02; 
            }

            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate totals and display in tabular format
    public static void displayReport(int[][] data, double[][] result) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-5s %-12s %-8s %-10s %-12s %-12s%n",
                "ID", "OldSalary", "Years", "Bonus%", "BonusAmt", "NewSalary");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = result[i][1];
            double newSalary = result[i][0];
            double bonusPercent = (years > 5) ? 5 : 2;

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-5d %-12d %-8d %-10.0f %-12.2f %-12.2f%n",
                    (i + 1), oldSalary, years, bonusPercent, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-8s %-10s %-12.2f %-12.2f%n",
                "TOTAL", totalOldSalary, "", "", totalBonus, totalNewSalary);
        System.out.println("-----------------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of employees : ");
        int employees = sc.nextInt();

        int[][] employeeData = generateEmployeeData(employees);
        double[][] bonusData = calculateBonus(employeeData);

        displayReport(employeeData, bonusData);
    }
}
