package day_8.hackerrank;

import java.util.*;

public class CoinExchange {

    public static long getWays(int n, List<Long> c) {

        long[] dp = new long[n + 1];

        dp[0] = 1;

        for (long coin : c) {

            for (int amount = (int) coin; amount <= n; amount++) {

                dp[amount] = dp[amount]
                        + dp[amount - (int) coin];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Long> coins = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            coins.add(sc.nextLong());
        }

        System.out.println(getWays(n, coins));

        sc.close();
    }
}
