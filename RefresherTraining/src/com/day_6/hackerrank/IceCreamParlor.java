package com.day_6.hackerrank;
import java.util.*;

public class IceCreamParlor {
	static class Price {
        int price;
        int index;

        Price(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    public static int binarySearch(Price[] arr, int target, int start) {

        int low = start;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid].price == target) {
                return mid;
            }

            if (arr[mid].price < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static List<Integer> icecreamParlor(
            int m, List<Integer> arr) {

        Price[] prices = new Price[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            prices[i] = new Price(arr.get(i), i + 1);
        }

        Arrays.sort(prices, (a, b) -> a.price - b.price);

        for (int i = 0; i < prices.length; i++) {

            int remaining = m - prices[i].price;

            int index = binarySearch(prices, remaining, i + 1);

            if (index != -1) {

                List<Integer> result = new ArrayList<>();

                result.add(prices[i].index);
                result.add(prices[index].index);

                Collections.sort(result);

                return result;
            }
        }

        return new ArrayList<>();
    }
    
    
    public static void main(String[] args) {

        int budget = 4;

        List<Integer> prices =
                Arrays.asList(1, 2, 3, 4, 2);

        List<Integer> result =
                icecreamParlor(budget, prices);

        System.out.println(result);
    }
}
