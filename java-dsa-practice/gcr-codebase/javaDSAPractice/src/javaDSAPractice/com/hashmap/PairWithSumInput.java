package javaDSAPractice.com.hashmap;
import java.util.*;

public class PairWithSumInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            if (set.contains(target - num)) {
                found = true;
                break;
            }
            set.add(num);
        }

        System.out.println(found ? "Pair exists" : "No such pair");
        
        sc.close();
    }
}
