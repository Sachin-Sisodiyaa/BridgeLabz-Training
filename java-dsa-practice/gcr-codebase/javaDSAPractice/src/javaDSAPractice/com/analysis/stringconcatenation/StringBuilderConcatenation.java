package javaDSAPractice.com.analysis.stringconcatenation;

public class StringBuilderConcatenation {

    public void concatenate(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
    }
}

