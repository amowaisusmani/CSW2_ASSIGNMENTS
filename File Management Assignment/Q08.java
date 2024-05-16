import java.io.File;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the current file name
        System.out.print("Enter the current file name (including path if necessary): ");
        String currentFileName = scanner.nextLine();

        // Check if the file exists
        File fileToRename = new File(currentFileName);
        if (!fileToRename.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        // Prompt the user for the new file name
        System.out.print("Enter the new file name (including path if necessary): ");
        String newFileName = scanner.nextLine();

        // Rename the file
        boolean renamed = fileToRename.renameTo(new File(newFileName));
        if (renamed) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }

        scanner.close();
    }
}
