package javaDSAPractice.com.algorithms.utilityclasses.stringbuilder;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(input);

        // Reverse
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());

        sc.close();
    }
}
