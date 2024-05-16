import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                // Perform some processing here
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("An IOException was caught when closing the BufferedReader: " + e.getMessage());
            }
        }
    }
}
