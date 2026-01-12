package javaDSAPractice.com.analysis.fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public void readFile(String filePath) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            // Reading file line by line
        }

        br.close();
    }
}

