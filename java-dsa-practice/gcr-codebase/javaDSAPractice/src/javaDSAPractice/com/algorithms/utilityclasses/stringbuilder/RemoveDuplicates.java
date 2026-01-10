package javaDSAPractice.com.algorithms.utilityclasses.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
