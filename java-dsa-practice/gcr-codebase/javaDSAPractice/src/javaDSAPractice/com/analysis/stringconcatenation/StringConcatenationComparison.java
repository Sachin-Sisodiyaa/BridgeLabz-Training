package javaDSAPractice.com.analysis.stringconcatenation;

public class StringConcatenationComparison {

    public static void main(String[] args) {

        int N = 100000; // Try 1_000, 10_000, 1_000_000 (careful with String)

        StringConcatenation stringTest = new StringConcatenation();
        StringBuilderConcatenation builderTest = new StringBuilderConcatenation();
        StringBufferConcatenation bufferTest = new StringBufferConcatenation();

        //String concate using Strings
        long startString = System.nanoTime();
        stringTest.concatenate(N);
        long endString = System.nanoTime();

        //String concate using StringBuilder
        long startBuilder = System.nanoTime();
        builderTest.concatenate(N);
        long endBuilder = System.nanoTime();

        //String concate using StringBuffer
        long startBuffer = System.nanoTime();
        bufferTest.concatenate(N);
        long endBuffer = System.nanoTime();

        System.out.println("Operations Count: " + N);
        System.out.println("String Time: " + (endString - startString) / 1_000_000.0 + " ms");
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) / 1_000_000.0 + " ms");
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) / 1_000_000.0 + " ms");
    }
}
