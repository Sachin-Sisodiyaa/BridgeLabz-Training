/*10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.*/



import java.util.Scanner;

public class PhoneRechargeSimulator {
	public static void main(String[] args){
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		double balance = 1000;
		int amount;

		while(balance > 0){
			System.out.println("Enter your operator : Jio || Airtel || VI ");
			String operator = sc.next().trim().toLowerCase();
			switch(operator){
				case "jio": System.out.println("Offer 1 : Rs.199 1.5 GB/day unlimited call & messages validity 28 days");
					    System.out.println("Offer 2 : Rs.399 2 GB/day unlimited call & messages validity 56 days");
					    System.out.println("Offer 3 : Rs.860 2 GB/day unlimited call & messages validity 86 days");
					    System.out.println("Enter amount");
					    amount = sc.nextInt();
					    if(amount > balance){
						 System.out.println("Insufficient balance");
						 System.out.println(" Your balance is : " + balance);
						 System.exit(1);
					    }
					    System.out.println("Seccussfully recharge");
					    System.out.println("Available balance after recharge : " + (balance-amount));
					    balance -= amount; 
					    break;

				case "airtel": System.out.println("Offer 1 : Rs.199 1.5 GB/day unlimited call & messages validity 28 days");
					       System.out.println("Offer 2 : Rs.399 2 GB/day unlimited call & messages validity 56 days");
					       System.out.println("Offer 3 : Rs.860 2 GB/day unlimited call & messages validity 86 days");
					       System.out.println("Enter amount");
					       amount = sc.nextInt();
					       if(amount > balance){
						    System.out.println("Insufficient balance");
						    System.out.println(" Your balance is : " + balance);
						    System.exit(1);
					       }
					       System.out.println("Seccussfully recharge");
					       System.out.println("Available balance after recharge : " + (balance-amount));
					       balance -= amount;
					       break;

				case "vi": System.out.println("Offer 1 : Rs.199 1.5 GB/day unlimited call & messages validity 28 days");
					   System.out.println("Offer 2 : Rs.399 2 GB/day unlimited call & messages validity 56 days");
					   System.out.println("Offer 3 : Rs.860 2 GB/day unlimited call & messages validity 86 days");
					   System.out.println("Enter amount");
					   amount = sc.nextInt();
					   if(amount > balance){
						System.out.println("Insufficient balance");
						System.out.println(" Your balance is : " + balance);
						System.exit(1);
					   }
					   System.out.println("Seccussfully recharge");
					   System.out.println("Available balance after recharge : " + (balance-amount));
					   balance -= amount;
					   break;
			}
		}
		sc.close();
	}
}