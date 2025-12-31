/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/



import java.util.Scanner;

public class CurrencyExchangeKiosk {
	public static void main(String[] args) {
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Currency Exchange Kiosk");
		float changeCurrency = 0;
		System.out.print("Enter amount in INR: ");
		long amount = sc.nextLong();

		do{
			System.out.println("Choose your target currency");
			System.out.println("\nUnited State Dollar (USD) || Canadian Dollar (CD) || England Pound (EP) || Euro || Yen");
			System.out.print("Enter target currency: ");
			String target = sc.next().trim().toLowerCase();
		
			switch(target){
				case "usd":changeCurrency += amount / 89.82f;
				break;
				case "cd":changeCurrency += amount / 65.54f;
				break;
				case "ep":changeCurrency += amount / 120.66f;
				break;
				case "euro":changeCurrency += amount / 105.46f;
				break;
				case "yen":changeCurrency += amount / 0.57f;
				break;
			}
			System.out.println("Changed currency INR to " + target +  " : " + amount + " ---> " + changeCurrency);
			changeCurrency = 0;
			
			System.out.println("Enter 1 to continue conversion || Enter 0 to Exit");
		}
		while(sc.nextInt() == 1);

		sc.close();

	}
} 
			