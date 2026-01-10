package javaDSAPractice.com.algorithms.utilityclasses.stringbuffer;

import java.util.Scanner;

public class ConcatenateStrings {

    static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer(); // create a StringBuffer

        for (String str : arr) {
            sb.append(str); // append each string
        }

        return sb.toString(); // convert to String
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String result = concatenateStrings(arr);
        System.out.println("Concatenated string: " + result);

        sc.close();
    }
}
