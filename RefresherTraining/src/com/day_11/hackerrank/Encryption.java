package com.day_11.hackerrank;
import java.util.Scanner;

public class Encryption {

    public static String encryption(String s) {

        s = s.replace(" ", "");

        int length = s.length();

        int rows = (int) Math.sqrt(length);
        int columns = rows;

        if (rows * columns < length) {
            columns++;
        }

        if (rows * columns < length) {
            rows++;
        }

        String result = "";

        for (int col = 0; col < columns; col++) {

            for (int row = 0; row < rows; row++) {

                int index = row * columns + col;

                if (index < length) {
                    result += s.charAt(index);
                }
            }

            result += " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(encryption(s));

        sc.close();
    }
}