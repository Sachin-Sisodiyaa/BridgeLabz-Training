/*Problem 1: The Coffee Counter Chronicles

Ravi runs a café where customers order different types of coffee with specific quantities.

Write a Java program that asks the user for the coffee type using switch, accepts quantity, calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, and continues serving customers using a while loop. The program should stop when the user types “exit”.*/




import java.util.Scanner;

public class CoffeeCounter{
	
	public static void main(String[] args){
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		double amount = 0.0;
        	double gstRate = 0.05;	
	
		//Loop to get user's choice of coffee
		while(true){
			System.out.println("\tCoffee Menu");
            		System.out.println("1. Normal Coffee - 250");
            		System.out.println("2. Black Coffee - 149");
            		System.out.println("3. Cold Coffee - 150");
            		System.out.println("4. Americano Coffee - 330");
            		System.out.println("5. Espresso Coffee - 280");
            		System.out.println("Type 'exit' to stop ordering");

			System.out.print("Enter your choice: ");
            		String order = sc.next();

            		if (order.equalsIgnoreCase("exit")) {
                		break;
            		}

            		System.out.print("Enter Quantity: ");
            		int quantity = sc.nextInt();

			//Switch to calculate amount
			switch (order) {
				case "1":amount += 250 * quantity;
					break;
				case "2":amount += 149 * quantity;
					break;
				case "3":amount += 150 * quantity;
					break;
				case "4":amount += 330 * quantity;
					break;
				case "5":amount += 280 * quantity;
					break;
				default:System.out.println("Invalid choice");
			}
			
		}
		
		//calculate GST & total amount
		double gstAmount = amount * gstRate;
        	double finalBill = amount + gstAmount;

		//result
        	System.out.println("\nSubtotal: " + amount);
        	System.out.println("GST (5%): " + gstAmount);
        	System.out.println("Total Amount Payable: " + finalBill);
		sc.close();

	}
}