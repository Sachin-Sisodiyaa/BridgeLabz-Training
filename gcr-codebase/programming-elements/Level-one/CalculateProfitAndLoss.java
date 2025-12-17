/*Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/

public class CalculateProfitAndLoss
{
	public static void main(String[] args)
	{
		float costPrice = 129, sellingPrice = 191;
		float profitINR = sellingPrice - costPrice;
		float profitPercentage = profitINR / costPrice * 100;
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profitINR + " and the Profit Percentage is " + profitPercentage);
	}
}
		
		