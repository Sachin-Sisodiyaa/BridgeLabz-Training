/*1. Number Guessing Game:
○ Write a Java program where the user thinks of a number between 1 and 100, and
the computer tries to guess the number by generating random guesses.
○ The user provides feedback by indicating whether the guess is high, low, or
correct. The program should be modular, with different functions for generating
guesses, receiving user feedback, and determining the next guess.*/


import java.util.Scanner;

public class NumberGuessingGame {

    // Generates a random guess between low and high
    static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    // Gets feedback from user
    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (low/high/correct): ");
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;

        System.out.println("Think of a number between 1 and 100");

	//Checking guess and print ans accordingly
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                break;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }
        sc.close();
    }
}

