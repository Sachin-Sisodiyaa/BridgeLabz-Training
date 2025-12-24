/*10. Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'

Expected Output:
Modified String: "Heo Word"*/



import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {

	//Taking input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.print("Character to remove: ");
        char remove = sc.next().charAt(0);

        String result = "";

	//Modifying string
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != remove) {
                result += text.charAt(i);
            }
        }

	//Result
        System.out.println("Modified String: " + result);
        sc.close();
    }
}
