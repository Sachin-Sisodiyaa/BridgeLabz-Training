/*8. Compare Two Strings

Problem:
Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"

Expected Output:
"apple" comes before "banana" in lexicographical order*/


import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {

	//Taking Inputs
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter string 1");
	String s1 = sc.next();
	System.out.println("Enter string 2");
	String s2 = sc.next();


        int i = 0;

	//Loop & condition for checking and print accordingly
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            i++;
        }

        if (i == s1.length() && i == s2.length()) {
            System.out.println("Both strings are equal");
        } 
	else if (i == s1.length() || s1.charAt(i) < s2.charAt(i)) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        } 
	else {
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        }
    }
}
