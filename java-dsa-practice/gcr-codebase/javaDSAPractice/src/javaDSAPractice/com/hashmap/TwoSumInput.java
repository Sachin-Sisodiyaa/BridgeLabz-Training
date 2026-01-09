package javaDSAPractice.com.hashmap;

import java.util.*;

public class TwoSumInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                found = true;
                break;
            }
            map.put(nums[i], i);
        }

        if (!found) {
            System.out.println("No two sum solution found");
        }
        sc.close();
    }
}
