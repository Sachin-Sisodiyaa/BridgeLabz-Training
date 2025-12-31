/* 20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.Scanner;

public class FestivalLuckyDraw {
	public static void main(String[] args) {
		//Taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Festival Lucky Draw");
		System.out.print("\nDraw a Number: ");
		int num = sc.nextInt();
	
		//while loop for lucky draw checking and loop till user want to exit
		while(num != -1){
			
			if(num > 0){
				if(num%3 == 0 && num%5 == 0){
					System.out.println("\nCongrets! you won the lucky draw");
				}
				else{
					System.out.println("\nBetter luck next time");
				}
			}
			else{
				continue;
			}

			System.out.print("\nDraw a Number || ");
			System.out.println("if you wnat to EXIT enter -1");
			num = sc.nextInt();
		}

		System.out.println("\nThank you for visiting festival lucky draw");
		sc.close();
	}
}