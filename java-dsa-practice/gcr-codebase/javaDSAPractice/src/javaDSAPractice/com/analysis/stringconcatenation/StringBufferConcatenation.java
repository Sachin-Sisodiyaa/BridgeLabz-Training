package javaDSAPractice.com.analysis.stringconcatenation;

public class StringBufferConcatenation {

    public void concatenate(int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
    }
}

