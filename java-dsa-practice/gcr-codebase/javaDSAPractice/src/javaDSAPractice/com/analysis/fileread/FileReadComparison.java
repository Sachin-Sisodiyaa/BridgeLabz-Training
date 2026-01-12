package javaDSAPractice.com.analysis.fileread;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\SACHIN\\OneDrive\\ドキュメント\\Q 1.What is java.md"; // e.g., 100MB or 500MB file

        FileReaderTest fileReaderTest = new FileReaderTest();
        InputStreamReaderTest inputStreamReaderTest = new InputStreamReaderTest();

        //FileReader
        long startFileReader = System.nanoTime();
        fileReaderTest.readFile(filePath);
        long endFileReader = System.nanoTime();

        //InputStreamReader
        long startInputStreamReader = System.nanoTime();
        inputStreamReaderTest.readFile(filePath);
        long endInputStreamReader = System.nanoTime();

        System.out.println("File Size Test Completed");
        System.out.println("FileReader Time: " +
                (endFileReader - startFileReader) / 1_000_000.0 + " ms");
        System.out.println("InputStreamReader Time: " +
                (endInputStreamReader - startInputStreamReader) / 1_000_000.0 + " ms");
    }
}
