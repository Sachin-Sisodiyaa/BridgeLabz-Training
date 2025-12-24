/*7. Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.*/



import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

	//Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        String result = "";

	//Conditional loop for toggle
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } 
	    else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } 
	    else {
                result += ch;
            }
        }
	
	//Result
        System.out.println("Toggled String: " + result);
        sc.close();
    }
}
