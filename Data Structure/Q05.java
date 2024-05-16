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
            // Call the recursive method to list files and subdirectories
            listFilesAndSubdirectories(directory, 0);
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }

        scanner.close();
    }

    // Recursive method to list files and subdirectories
    public static void listFilesAndSubdirectories(File directory, int level) {
        // Print the directory name with indentation based on the level
        System.out.println(getIndentation(level) + directory.getName() + " (Directory)");

        // Get list of files and directories within the current directory
        File[] files = directory.listFiles();

        // Iterate over the files and subdirectories
        for (File file : files) {
            // If it's a directory, recursively call the method
            if (file.isDirectory()) {
                listFilesAndSubdirectories(file, level + 1);
            } else { // If it's a file, print its name with indentation
                System.out.println(getIndentation(level + 1) + file.getName());
            }
        }
    }

    // Helper method to generate indentation based on the level
    public static String getIndentation(int level) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indentation.append("  "); // Two spaces for each level
        }
        return indentation.toString();
    }
}
