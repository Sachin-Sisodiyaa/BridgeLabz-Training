/*5. Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.*/


import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
	// Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String longest = "";
        String current = "";

	//Condition to find longest word
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                current += ch;
            } 
	    else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }

        if (current.length() > longest.length()) {
            longest = current;
        }

	//result
        System.out.println("Longest Word: " + longest);
        sc.close();
    }
}
