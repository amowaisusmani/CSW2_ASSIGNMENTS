import java.util.Scanner;

public class Q03 {
    private static StringBuffer text = new StringBuffer();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSimple Text Editor Menu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    append(appendText);
                    break;
                case 2:
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    insert(insertText, insertIndex);
                    break;
                case 3:
                    System.out.print("Enter start index to delete: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index to delete: ");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    delete(startIndex, endIndex);
                    break;
                case 4:
                    reverse();
                    break;
                case 5:
                    System.out.print("Enter start index to replace: ");
                    int replaceStartIndex = scanner.nextInt();
                    System.out.print("Enter end index to replace: ");
                    int replaceEndIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter replacement text: ");
                    String replacementText = scanner.nextLine();
                    replace(replaceStartIndex, replaceEndIndex, replacementText);
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }

            if (choice != 6) {
                displayTextInfo();
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void append(String appendText) {
        text.append(appendText);
    }

    private static void insert(String insertText, int index) {
        if (index >= 0 && index <= text.length()) {
            text.insert(index, insertText);
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void delete(int startIndex, int endIndex) {
        if (startIndex >= 0 && endIndex <= text.length() && startIndex <= endIndex) {
            text.delete(startIndex, endIndex);
        } else {
            System.out.println("Invalid indices.");
        }
    }

    private static void reverse() {
        text.reverse();
    }

    private static void replace(int startIndex, int endIndex, String replacementText) {
        if (startIndex >= 0 && endIndex <= text.length() && startIndex <= endIndex) {
            text.replace(startIndex, endIndex, replacementText);
        } else {
            System.out.println("Invalid indices.");
        }
    }

    private static void displayTextInfo() {
        System.out.println("Current Text: " + text);
        System.out.println("Current Capacity: " + text.capacity());
        System.out.println("Current Length: " + text.length());
    }
}
