import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q02 {
    public static void main(String[] args) {
        String fileName = "diary.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Content of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
