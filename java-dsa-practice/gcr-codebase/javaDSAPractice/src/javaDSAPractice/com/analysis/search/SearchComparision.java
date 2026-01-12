package javaDSAPractice.com.analysis.search;

import java.util.Arrays;

public class SearchComparision {

    public static void main(String[] args) {

        int N = 1_000_000;          // Dataset size
        int target = N - 1;         // Worst-case target

        int[] data = new int[N];

        // Fill array
        for (int i = 0; i < N; i++) {
            data[i] = i;
        }

        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();

        //Linear Search Timing 
        long startLinear = System.nanoTime();
        linearSearch.search(data, target);
        long endLinear = System.nanoTime();

        double linearTimeMs = (endLinear - startLinear) / 1_000_000.0;

        //Binary Search Timing
        
        Arrays.sort(data); // Required for binary search

        long startBinary = System.nanoTime();
        binarySearch.search(data, target);
        long endBinary = System.nanoTime();

        double binaryTimeMs = (endBinary - startBinary) / 1_000_000.0;

        //Results
        System.out.println("Dataset Size: " + N);
        System.out.println("Linear Search Time: " + linearTimeMs + " ms");
        System.out.println("Binary Search Time: " + binaryTimeMs + " ms");
    }
}
