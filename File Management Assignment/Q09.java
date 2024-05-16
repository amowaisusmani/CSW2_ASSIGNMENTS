import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request the file name from the user
        System.out.print("Enter the file name (including path if not in the current directory): ");
        String fileName = scanner.nextLine();

        // Create a File object with the provided file name
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            // Display file metadata
            System.out.println("\nFile Metadata for " + fileName + ":");
            System.out.println("File Size: " + file.length() + " bytes");

            // Format last modified date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date lastModifiedDate = new Date(file.lastModified());

            System.out.println("Last Modified Date: " + dateFormat.format(lastModifiedDate));

            // Display other available attributes
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Is Hidden: " + file.isHidden());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
        } else {
            System.out.println("The specified file does not exist.");
        }

        scanner.close();
    }
}
