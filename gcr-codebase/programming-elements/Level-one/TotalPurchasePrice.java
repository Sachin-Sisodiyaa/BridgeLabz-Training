/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___*/



import java.util.Scanner;
public class TotalPurchasePrice
{
	public static void main(String[] args)
	{
		//Declare Variable unit price and quantity
		float unitPrice, totalPrice;
		int quantity;

		//Taking input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter unit price of an item");
		unitPrice = input.nextFloat();
		System.out.println("Enter Quantity to be bought");
		quantity = input.nextInt();

		//Calculating total Purchase price
		totalPrice = unitPrice * quantity;

		//Displaying Total purchase Price
		System.out.println(" The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice );
		input.close();
		}
}
