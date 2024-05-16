import java.io.File;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for directory path
        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the specified directory exists and is indeed a directory
        if (directory.exists() && directory.isDirectory()) {
            // List all files in the directory
            File[] files = directory.listFiles();

            // Print ".txt" files
            System.out.println("Text files in the directory:");
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }

        scanner.close();
    }
}
