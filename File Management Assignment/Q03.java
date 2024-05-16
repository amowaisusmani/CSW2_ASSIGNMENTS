import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Prompt the user for the new diary entry
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your new diary entry: ");
        String newEntry = scanner.nextLine();
        scanner.close();

        // Get the current timestamp
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the timestamp
        String formattedTimestamp = timestamp.format(formatter);

        // Append the new entry along with the timestamp to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("diary.txt", true))) {
            writer.write("\n"); // Ensure a new line for the new entry
            writer.write("Timestamp: " + formattedTimestamp + "\n");
            writer.write("Entry: " + newEntry + "\n");
            System.out.println("New entry added to diary.txt successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while writing to the file: " + e.getMessage());
        }
    }
}
