/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/

public class SpringSeason{
		
	//Method to check
	public static Boolean springSeason(int month, int day){
		if((month == 3) && (day >= 20 && day <=31))
			return true;

		else if((month == 4 ) && (day >= 1 && day <=30) || (month == 5) && (day >= 1 && day <=31))
			return true;

		else if((month == 6) && (day >= 1 && day <=20))
			return false;
		
		else
			return false;
	}
		
	public static void main(String[] args)
	{
		//Variable declaration
		int month, day;

		// Enter input in command line
		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);
		
		//Printing result
		if(SpringSeason.springSeason(month, day)){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}
}