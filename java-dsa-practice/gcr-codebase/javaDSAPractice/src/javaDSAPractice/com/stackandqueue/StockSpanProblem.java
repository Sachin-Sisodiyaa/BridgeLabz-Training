package javaDSAPractice.com.stackandqueue;

import java.util.Stack;

public class StockSpanProblem {

    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Pop while current price is higher
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // If empty, all previous prices are smaller
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(price);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
