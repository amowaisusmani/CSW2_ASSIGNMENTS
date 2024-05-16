import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Prompt the user to enter a character to search
        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);

        // Find first and last occurrences of the character
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        // Display the character array
        System.out.println("Character Array: " + new String(charArray));

        // Display the positions found
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at position: " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "' at position: " + lastOccurrence);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }

        scanner.close();
    }
}
