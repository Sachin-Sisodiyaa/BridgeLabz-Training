/*9. Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"

Expected Output:
Most Frequent Character: 's'*/



import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {

	//Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        int[] freq = new int[256];

	//Store frequencies
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

	//Finding max freent char
        char result = text.charAt(0);
        int max = freq[result];

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > max) {
                max = freq[text.charAt(i)];
                result = text.charAt(i);
            }
        }

	//Result
        System.out.println("Most Frequent Character: '" + result + "'");
        sc.close();
    }
}
