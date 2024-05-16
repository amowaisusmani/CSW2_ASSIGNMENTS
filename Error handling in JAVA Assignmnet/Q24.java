import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Q24 {
    public static void main(String[] args) {
        File file = new File("NonExistentFile.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}
