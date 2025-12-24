/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/




import java.util.Scanner;

public class SplitStringThree {

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {

        int count = 1; 
        // Count number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                temp = temp + text.charAt(i);
            } else {
                words[index] = temp;
                temp = "";
                index++;
            }
        }
        words[index] = temp; 
        return words;
    }

    // Method to find string length without using length()
    public static int findLength(String word) {

        int length = 0;

        try {
            while (true) {
                word.charAt(length);
                length++;
            }
        } catch (Exception e) {
            
        }

        return length;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordLengthArray(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestAndLongest(String[][] data) {

        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(data[0][1]);
        int maxLength = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);

            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }

            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }

        int[] result = { minIndex, maxIndex };
        return result;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordData = wordLengthArray(words);
        int[] result = findShortestAndLongest(wordData);

        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");

        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t\t" + wordData[i][1]);
        }

        System.out.println("\nShortest Word: " + wordData[result[0]][0]);
        System.out.println("Longest Word: " + wordData[result[1]][0]);

        sc.close();
    }
}
