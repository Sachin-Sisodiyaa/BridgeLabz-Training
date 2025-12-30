/*8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.*/


import java.util.Scanner;

public class ShopkeepersDiscount{
	public static void main(String[] args){
		
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		float totalBill = 0;
		float discount = 0;
		System.out.println("Enter item prices");
		for(int i=0; i<7; i++){
			totalBill += sc.nextInt();
		}
	
		//if else conditions to calculate discount
		if(totalBill > 1000 && totalBill < 5000){
			discount += totalBill * 0.05;
		}
		else if(totalBill > 5000 && totalBill < 10000){
			discount += totalBill * 0.1;
		}
		else{
			discount += totalBill * 0.2;
		}

		//Diiscount percengate
		int percent = (int)((discount / totalBill) * 100);
		
		//Printing results
		System.out.println("Total price of all items: " + totalBill);
		System.out.println("Discount percentage on total amount: " + percent + " % ");
		System.out.println("Discount price on total amount: " + discount);
		System.out.println("Final price after discount: " + (totalBill - discount));

		sc.close();
	}
}