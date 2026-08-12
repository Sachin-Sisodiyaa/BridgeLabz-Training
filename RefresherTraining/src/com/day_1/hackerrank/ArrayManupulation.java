package com.day_1.hackerrank;
import java.util.*;

public class ArrayManupulation {
	public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] arr = new long[n + 2];

        for (List<Integer> query : queries) {

            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            arr[a] += k;
            arr[b + 1] -= k;
        }

        long current = 0;
        long max = 0;

        for (int i = 1; i <= n; i++) {

            current += arr[i];

            if (current > max) {
                max = current;
            }
        }

        return max;
    }

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();
	    int q = sc.nextInt();

	    List<List<Integer>> queries = new ArrayList<>();

	    for (int i = 0; i < q; i++) {

	        List<Integer> query = new ArrayList<>();

	        query.add(sc.nextInt());
	        query.add(sc.nextInt());
	        query.add(sc.nextInt());

	        queries.add(query);
	    }

	    long result = arrayManipulation(n, queries);

	    System.out.println(result);

	    sc.close();
	}
}
