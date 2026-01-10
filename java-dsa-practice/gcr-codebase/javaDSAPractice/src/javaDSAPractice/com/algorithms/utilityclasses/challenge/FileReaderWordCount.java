package javaDSAPractice.com.algorithms.utilityclasses.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWordCount {

    public static void main(String[] args) {

        String filePath ="C:\\Users\\SACHIN\\OneDrive\\ドキュメント\\Q 1.What is java.txt"; // 100MB text file
        long startTime = System.nanoTime();
        long wordCount = 0;

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {

                line = line.trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();

        System.out.println("FileReader Word Count: " + wordCount);
        System.out.println("Time Taken (ms): " + (endTime - startTime) / 1_000_000);
    }
}
