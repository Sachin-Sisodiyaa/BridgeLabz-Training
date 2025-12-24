/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/


import java.util.Scanner;

public class SplitStringTwo {

    // Method to find string length without using length()
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int length = getStringLength(text);
        int wordCount = 1;

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int idx = 1;
        spaceIndex[0] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = length;

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to return 2D array of word and its length
    public static String[][] wordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = getStringLength(words[i]);
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = wordLengthTable(words);

        // Display output in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t\t" + length);
        }

        sc.close();
    }
}
