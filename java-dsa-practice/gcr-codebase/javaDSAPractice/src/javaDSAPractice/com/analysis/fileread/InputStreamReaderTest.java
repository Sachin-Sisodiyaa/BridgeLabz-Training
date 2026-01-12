package javaDSAPractice.com.analysis.fileread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public void readFile(String filePath) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath))
        );

        String line;
        while ((line = br.readLine()) != null) {
            // Reading file line by line
        }

        br.close();
    }
}
