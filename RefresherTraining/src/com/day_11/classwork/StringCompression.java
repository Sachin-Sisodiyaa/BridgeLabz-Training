package com.day_11.classwork;
import java.util.HashMap;
import java.util.Scanner;

public class StringCompression {

    public static String compress(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String result = "";

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                result = result + ch + map.get(ch);
                map.remove(ch);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Compressed: " + compress(str));

        sc.close();
    }
}