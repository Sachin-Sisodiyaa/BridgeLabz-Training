import java.util.Scanner;

public class EmployeesBonus
{
	public static void main(String[] args)
	{
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		
        	int employees = 10;

        	double[] salary = new double[employees];
        	double[] years = new double[employees];
        	double[] bonus = new double[employees];
        	double[] newSalary = new double[employees];

        	double totalOldSalary = 0;
        	double totalBonus = 0;
        	double totalNewSalary = 0;

        	for (int i = 0; i < employees; i++) {
            		System.out.println("\nEnter details for Employee " + (i + 1));

            		System.out.print("Salary: ");
            		double s = sc.nextDouble();

            		System.out.print("Years of Service: ");
            		double y = sc.nextDouble();

            		//Checking invalid inputs
            		if (s <= 0 || y < 0) {
                		System.out.println("Invalid input! Enter positive values.");
                		i--;       
                		continue;
            		}

            		salary[i] = s;
            		years[i] = y;
            		totalOldSalary += s;
        	}

        	// Bonus calculation loop
        	for (int i = 0; i < employees; i++) {

            		if (years[i] > 5) {
                	bonus[i] = salary[i] * 0.05;
            		} 
			else {
                		bonus[i] = salary[i] * 0.02;
            		}

            		newSalary[i] = salary[i] + bonus[i];

            		totalBonus += bonus[i];
            		totalNewSalary += newSalary[i];
        	}

        	// Display outputs
        	System.out.println("\nDetails of Employees");
        	for (int i = 0; i < employees; i++) {
            		System.out.println("\nEmployee " + (i + 1));
            		System.out.println("Old Salary: " + salary[i] + " Years of Service: " + years[i] + " Bonus: " + bonus[i] + " New Salary: " + newSalary[i]);
                  }

        	System.out.println("\nSalary and payouts");
        	System.out.println("Total Old Salary: " + totalOldSalary + " Total Bonus Payout: " + totalBonus + " Total New Salary: " + totalNewSalary);
        
	        sc.close();
    }
}
	