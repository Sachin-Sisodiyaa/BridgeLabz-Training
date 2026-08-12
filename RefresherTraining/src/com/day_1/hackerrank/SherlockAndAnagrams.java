package com.day_1.hackerrank;
import java.util.*;

public class SherlockAndAnagrams {
	public static int sherlockAndAnagrams(String s) {

        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            int[] frequency = new int[26];

            for (int j = i; j < s.length(); j++) {

                frequency[s.charAt(j) - 'a']++;

                String key = Arrays.toString(frequency);

                count += map.getOrDefault(key, 0);

                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {

            String s = sc.next();

            System.out.println(sherlockAndAnagrams(s));
        }
    }
}
