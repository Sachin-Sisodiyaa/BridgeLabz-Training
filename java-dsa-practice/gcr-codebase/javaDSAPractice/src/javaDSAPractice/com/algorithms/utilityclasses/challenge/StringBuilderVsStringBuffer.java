package javaDSAPractice.com.algorithms.utilityclasses.challenge;

public class StringBuilderVsStringBuffer {

    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        // -------- StringBuilder --------
        long startBuilder = System.nanoTime();

        StringBuilder sb = new StringBuilder(iterations * text.length());
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // -------- StringBuffer --------
        long startBuffer = System.nanoTime();

        StringBuffer sbuf = new StringBuffer(iterations * text.length());
        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // -------- Results --------
        System.out.println("StringBuilder Time (ms): " + builderTime / 1_000_000);
        System.out.println("StringBuffer Time (ms): " + bufferTime / 1_000_000);
    }
}
