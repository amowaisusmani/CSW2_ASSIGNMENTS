import java.io.*;

public class Q07 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user for source file path
            System.out.print("Enter the source file path: ");
            String sourceFilePath = reader.readLine();

            // Prompt the user for destination file path
            System.out.print("Enter the destination file path: ");
            String destinationFilePath = reader.readLine();

            File sourceFile = new File(sourceFilePath);
            File destinationFile = new File(destinationFilePath);

            // Check if the source file exists
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            // Check if the destination file already exists
            if (destinationFile.exists()) {
                System.out.print("Destination file already exists. Do you want to overwrite it? (Y/N): ");
                String overwriteChoice = reader.readLine();
                if (!overwriteChoice.equalsIgnoreCase("Y")) {
                    System.out.println("File copy operation aborted.");
                    return;
                }
            }

            // Perform the copy operation
            copyFile(sourceFile, destinationFile);
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }

    private static void copyFile(File source, File destination) throws IOException {
        try (InputStream inputStream = new FileInputStream(source);
             OutputStream outputStream = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}
