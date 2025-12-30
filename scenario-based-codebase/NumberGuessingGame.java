/*7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/


import java.util.Scanner;

public class NumberGuessingGame{
	public static void main(String[] args){

		//Variable initialization
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = (int) (Math.random() * 100) + 1;
		System.out.println("Lets begin the number guessing game");
		System.out.println("Guess the number between 1 to 100");
		
		//do-while loop to check the guess
		do{ 
			int guess = sc.nextInt();
			if(num == guess){
				System.out.println("Congrets! your guess is correct");
			}
			else if(num < guess){
				System.out.println("Guess number is Too High");
			}
			else if(num > guess){
				System.out.println("Guess number is Too Low");
			}
			else{
				System.out.println("Invalid Number");
			}
			count++;
		}
		while(count < 5);	
		
		System.out.println("You lost the game || Correct number is : " + num);

		sc.close();
	}
}