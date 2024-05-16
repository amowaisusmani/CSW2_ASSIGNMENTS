import java.io.File;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request the directory path from the user
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        // Create a File object with the provided directory path
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // List all files and directories in the specified directory
            File[] filesAndDirectories = directory.listFiles();

            System.out.println("\nFiles and Directories in " + directoryPath + ":");

            if (filesAndDirectories != null) {
                // Iterate through the files and directories and print their names
                for (File fileOrDirectory : filesAndDirectories) {
                    System.out.println(fileOrDirectory.getName());
                }
            } else {
                System.out.println("No files or directories found.");
            }
        } else {
            System.out.println("The specified directory does not exist.");
        }

        scanner.close();
    }
}
