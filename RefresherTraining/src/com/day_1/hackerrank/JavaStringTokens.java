package com.day_1.hackerrank;
import java.util.Scanner;

public class JavaStringTokens {
	public static String[] findToken(String s){
        s = s.trim();
        String regex = "[ !,?._'@]+";
        String[] tokens = s.split(regex);
        if(s.isEmpty()){
            return new String[0];
        }
        return tokens;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String tokens[] = findToken(s);
        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}
