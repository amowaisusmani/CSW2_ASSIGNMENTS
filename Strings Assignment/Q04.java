import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.print("Enter the initial string: ");
        stringBuilder.append(scanner.nextLine());

        char choice;
        do {
            System.out.println("\nCurrent string: " + stringBuilder.toString());
            System.out.println("Choose an operation:");
            System.out.println("a. Add a substring at a specified position.");
            System.out.println("b. Remove a range of characters from the string.");
            System.out.println("c. Modify a character at a specified index.");
            System.out.println("d. Concatenate another string at the end.");
            System.out.println("e. Exit");

            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 'a':
                    System.out.print("Enter the substring to add: ");
                    String substringToAdd = scanner.nextLine();
                    System.out.print("Enter the position to add: ");
                    int position = scanner.nextInt();
                    stringBuilder.insert(position, substringToAdd);
                    break;
                case 'b':
                    System.out.print("Enter the starting index of the range to remove: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter the ending index of the range to remove: ");
                    int endIndex = scanner.nextInt();
                    stringBuilder.delete(startIndex, endIndex + 1);
                    break;
                case 'c':
                    System.out.print("Enter the index to modify: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the character to replace with: ");
                    char newChar = scanner.next().charAt(0);
                    stringBuilder.setCharAt(index, newChar);
                    break;
                case 'd':
                    System.out.print("Enter the string to concatenate: ");
                    String concatString = scanner.nextLine();
                    stringBuilder.append(concatString);
                    break;
                case 'e':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'e');

        scanner.close();
    }
}
