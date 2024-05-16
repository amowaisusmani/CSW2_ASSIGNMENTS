import java.io.*;
import java.nio.file.*;

class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class Q04 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command line argument.");
            return;
        }

        String filePath = args[0];

        try {
            readFile(filePath);
        } catch (FileNotFoundException | FileReadPermissionException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException, FileReadPermissionException {
        Path path = Paths.get(filePath);

        if (!Files.exists(path)) {
            throw new FileNotFoundException("File does not exist at path: " + filePath);
        }

        if (!Files.isReadable(path)) {
            throw new FileReadPermissionException("File cannot be read due to permission issues at path: " + filePath);
        }

        try {
            String content = new String(Files.readAllBytes(path));
            System.out.println("File content: \n" + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
