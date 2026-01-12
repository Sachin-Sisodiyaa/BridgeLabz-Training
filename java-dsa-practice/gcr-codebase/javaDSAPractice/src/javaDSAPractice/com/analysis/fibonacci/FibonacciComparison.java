package javaDSAPractice.com.analysis.fibonacci;

public class FibonacciComparison {

    public static void main(String[] args) {

        int N = 30; // Try 10, 30 (avoid large values for recursion)

        FibonacciRecursive recursive = new FibonacciRecursive();
        FibonacciIterative iterative = new FibonacciIterative();

        //Recursive Fibonacci
        long startRecursive = System.nanoTime();
        int recResult = recursive.fibonacci(N);
        long endRecursive = System.nanoTime();

        //Iterative Fibonacci
        long startIterative = System.nanoTime();
        int iterResult = iterative.fibonacci(N);
        long endIterative = System.nanoTime();

        System.out.println("Fibonacci Number: " + N);
        System.out.println("Recursive Result: " + recResult);
        System.out.println("Iterative Result: " + iterResult);

        System.out.println("\nRecursive Time: " +
                (endRecursive - startRecursive) / 1_000_000.0 + " ms");

        System.out.println("Iterative Time: " +
                (endIterative - startIterative) / 1_000_000.0 + " ms");
    }
}

