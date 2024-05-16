import java.io.*;
import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for diary entry
        System.out.print("Enter your diary entry: ");
        String entry = scanner.nextLine();

        // Get current date
        Date date = new Date();
        String currentDate = date.toString();

        // Check if file already exists
        File file = new File("diary.txt");
        if (file.exists()) {
            System.out.println("Warning: The diary file already exists. Appending to existing content.");
        }

        // Write to file
        try (FileWriter writer = new FileWriter(file, true)) {
            // Write current date followed by the user's entry
            writer.write(currentDate + "\n");
            writer.write(entry + "\n\n");

            System.out.println("Diary entry successfully added to diary.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
