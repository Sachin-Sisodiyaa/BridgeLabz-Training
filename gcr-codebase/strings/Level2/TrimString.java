/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result*/




import java.util.Scanner;

public class TrimString {

    // Method to find start and end index without leading/trailing spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        int[] indexes = { start, end };
        return indexes;
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Get trim indexes
        int[] indexes = findTrimIndexes(input);

        // Create trimmed string using charAt()
        String trimmedUsingCharAt = createSubstring(input, indexes[0], indexes[1]);

        // Trim using built-in method
        String trimmedUsingBuiltIn = input.trim();

        // Compare both strings
        boolean isSame = compareStrings(trimmedUsingCharAt, trimmedUsingBuiltIn);

        // Display results
        System.out.println("\nTrimmed String (Using charAt): \"" + trimmedUsingCharAt + "\"");
        System.out.println("Trimmed String (Using trim()): \"" + trimmedUsingBuiltIn + "\"");
        System.out.println("Are both strings equal? " + isSame);

        sc.close();
    }
}
