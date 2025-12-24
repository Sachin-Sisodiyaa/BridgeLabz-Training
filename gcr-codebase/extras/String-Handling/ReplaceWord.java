/*12. Write a replace method in Java that replaces a given word with another word in a
sentence:*/


import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {

	//Takinng inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.next();

        System.out.print("New word: ");
        String newWord = sc.next();

        String result = "";
        String word = "";

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                if (word.equals(oldWord)) {
                    result += newWord;
                } 
		else {
                    result += word;
                }
                if (i < sentence.length()) result += " ";
                word = "";
            } else {
                word += sentence.charAt(i);
            }
        }

        System.out.println("Modified Sentence: " + result);
        sc.close();
    }
}
