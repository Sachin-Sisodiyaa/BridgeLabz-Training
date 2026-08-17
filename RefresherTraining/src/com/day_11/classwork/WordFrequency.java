package com.day_11.classwork;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {

    public static void countWords(String str) {

        String[] words = str.toLowerCase().split(" ");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        countWords(str);

        sc.close();
    }
}