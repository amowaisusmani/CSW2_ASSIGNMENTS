import java.io.File;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the name of the file to be deleted
        System.out.print("Enter the name of the file to be deleted: ");
        String fileName = scanner.nextLine();

        // Create a File object with the specified file name
        File fileToDelete = new File(fileName);

        // Check if the file exists
        if (fileToDelete.exists()) {
            // Attempt to delete the file
            if (fileToDelete.delete()) {
                System.out.println("File '" + fileName + "' has been successfully deleted.");
            } else {
                System.out.println("Failed to delete the file '" + fileName + "'.");
            }
        } else {
            System.out.println("The file '" + fileName + "' does not exist.");
        }

        scanner.close();
    }
}
