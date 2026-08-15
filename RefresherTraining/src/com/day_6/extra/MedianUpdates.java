package com.day_6.extra;

import java.util.*;

public class MedianUpdates {

    public static int binarySearch(List<Integer> list, int value) {

        int low = 0;
        int high = list.size();

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid) < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static String getMedian(List<Integer> list) {

        int n = list.size();

        if (n == 0) {
            return "Wrong!";
        }

        if (n % 2 != 0) {

            return String.valueOf(list.get(n / 2));
        }

        int left = list.get(n / 2 - 1);
        int right = list.get(n / 2);

        double median = (left + right) / 2.0;

        if (median == (long) median) {
            return String.valueOf((long) median);
        }

        return String.format("%.1f", median);
    }

    public static List<String> runningMedian(List<String> operations) {

        List<Integer> list = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (String operation : operations) {

            String[] parts = operation.split(" ");

            char type = parts[0].charAt(0);
            int value = Integer.parseInt(parts[1]);

            int position = binarySearch(list, value);

            if (type == 'a') {

                list.add(position, value);

            } else if (type == 'r') {

                if (position >= list.size()
                        || list.get(position) != value) {

                    result.add("Wrong!");
                    continue;
                }

                list.remove(position);
            }

            result.add(getMedian(list));
        }

        return result;
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {

        char operation = sc.next().charAt(0);
        int value = sc.nextInt();

        int position = binarySearch(list, value);

        if (operation == 'a') {

            list.add(position, value);

        } else if (operation == 'r') {

            if (position >= list.size()
                    || list.get(position) != value) {

                System.out.println("Wrong!");
                continue;
            }

            list.remove(position);
        }

        int size = list.size();

        if (size == 0) {

            System.out.println("Wrong!");

        } else if (size % 2 == 1) {

            System.out.println(list.get(size / 2));

        } else {

            int left = list.get(size / 2 - 1);
            int right = list.get(size / 2);

            double median = (left + right) / 2.0;

            if (median == (long) median) {
                System.out.println((long) median);
            } else {
                System.out.println(median);
            }
        }
    }

    sc.close();
   }
}

