package javaDSAPractice.com.algorithms.searchingalgorithms.linearsearch;


import java.util.Scanner;

public class SearchWordInSentences {

    static String findSentenceContainingWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) { // check if word exists in sentence
                return sentence; // first sentence found
            }
        }
        return "Not Found"; // word not in any sentence
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        String[] sentences = new String[n];

        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();

        String result = findSentenceContainingWord(sentences, word);

        System.out.println("Result: " + result);

        sc.close();
    }
}
