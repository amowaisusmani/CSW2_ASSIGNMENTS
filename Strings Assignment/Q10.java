import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        while (true) {
            // Display menu
            System.out.println("\nString Explorer Menu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Get character at index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Result: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Result: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    int index = inputString.indexOf(searchChar);
                    if (index != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + index);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter an index: ");
                    int charIndex = scanner.nextInt();
                    if (charIndex >= 0 && charIndex < inputString.length()) {
                        System.out.println("Character at index " + charIndex + ": " + inputString.charAt(charIndex));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.print("Enter another string to concatenate: ");
                    String anotherString = scanner.nextLine();
                    inputString += anotherString;
                    System.out.println("Result after concatenation: " + inputString);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
