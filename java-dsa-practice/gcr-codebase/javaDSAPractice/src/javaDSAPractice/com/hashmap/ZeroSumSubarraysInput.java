package javaDSAPractice.com.hashmap;

import java.util.*;

public class ZeroSumSubarraysInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        boolean found = false; 

        // Handles subarrays starting from index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If same sum seen before → zero-sum subarray
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println(
                        "Zero sum subarray: " + (start + 1) + " to " + i
                    );
                    found = true;
                }
            }

            // Store prefix sum index
            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }

        if (!found) {
            System.out.println("No zero-sum subarray found");
        }

        sc.close();
    }
}

