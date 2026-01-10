package javaDSAPractice.com.algorithms.utilityclasses.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountUsingFileReader {

    public static void main(String[] args) {
        String filePath = "C:\\GitProjects\\Java programming workspace\\java-dsa-practice\\gcr-codebase\\javaDSAPractice\\src\\javaDSAPractice\\com\\algorithms\\utilityclasses\\filereader\\Sample.txt"; // file name or full path
        String targetWord = "java";
        int count = 0;

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Split line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            bufferedReader.close();

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
