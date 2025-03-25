import java.io.*;

public class ReadingComparison {

    public static void main(String[] args) {
        String filePath = "largefile.txt"; // Replace with a valid 500MB file path

        // Using FileReader (Character Stream)
        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1); // Read character by character
            System.out.println("FileReader Reading Done.");
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        // Using InputStreamReader (Byte Stream)
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            while (isr.read() != -1); // Read byte by byte and convert to character
            System.out.println("InputStreamReader Reading Done.");
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
    }
}
