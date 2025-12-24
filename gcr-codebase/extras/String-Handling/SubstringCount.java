/*6. Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.*/



import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
	
	//Taking Inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = 0;

	//Conditions and loops to find count of substrings
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                count++;
            }
        }
	
	//Result
        System.out.println("Occurrences: " + count);
        sc.close();
    }
}
