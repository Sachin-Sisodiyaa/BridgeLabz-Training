package com.day_8.hackerrank;

import java.util.*;

public class PermutationsOfString {

    public static void generate(List<String> list, int index,
                                Set<List<String>> set) {

        if (index == list.size()) {
            set.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < list.size(); i++) {

            String temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);

            generate(list, index + 1, set);

            temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        Set<List<String>> set = new HashSet<>();

        generate(list, 0, set);

        List<List<String>> result = new ArrayList<>(set);

        Collections.sort(result, (a, b) -> {

            for (int i = 0; i < a.size(); i++) {

                int compare = a.get(i).compareTo(b.get(i));

                if (compare != 0) {
                    return compare;
                }
            }

            return 0;
        });

        for (List<String> permutation : result) {

            for (String str : permutation) {
                System.out.print(str + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
