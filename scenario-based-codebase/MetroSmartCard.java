/* 4. Metro Smart Card Fare Deduction 
In Delhi Metro, fare varies by distance.
● Ask the user for distance.
● Calculate fare using ternary operator.
● Deduct from smart card balance.
Loop until balance is exhausted or the user quits.
*/


import java.util.Scanner;

public class MetroSmartCard {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 200.0;
        System.out.println("Initial Smart Card Balance: " + balance);

        while (balance > 0) {

        	System.out.print("\nEnter distance in km: ");
                int distance = sc.nextInt();

            	// Fare calculation using ternary operator
            	double fare = (distance <= 5) ? 10 : (distance <= 10) ? 20 : 30;

            	if (balance >= fare) {
                	balance -= fare;
                	System.out.println("Fare Deducted: " + fare);
                	System.out.println("Remaining Balance: " + balance);
            	} 
		else {
                	System.out.println("Insufficient balance");
                	break;
            	}

            	System.out.print("Do you want to continue? (y/n): ");
            	char choice = sc.next().charAt(0);

            	if (choice == 'n' || choice == 'N') {
                	break;
            	}
        }

        System.out.println("\nThank you for using Delhi Metro");
        sc.close();
    }
}
