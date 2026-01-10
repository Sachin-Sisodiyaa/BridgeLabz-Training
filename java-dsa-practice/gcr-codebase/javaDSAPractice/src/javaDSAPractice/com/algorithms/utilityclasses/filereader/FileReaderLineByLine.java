package javaDSAPractice.com.algorithms.utilityclasses.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLineByLine {

    public static void main(String[] args) {
        String filePath = "C:\\GitProjects\\Java programming workspace\\java-dsa-practice\\gcr-codebase\\javaDSAPractice\\src\\javaDSAPractice\\com\\algorithms\\utilityclasses\\filereader\\Sample.txt"; // file name or full path
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
