import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two strings from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings using the String method
        String concatenatedStringMethod = firstString.concat(secondString);

        // Concatenate the strings using the + operator
        String concatenatedPlusOperator = firstString + secondString;

        // Display both results
        System.out.println("\nConcatenated String (Using String method): " + concatenatedStringMethod);
        System.out.println("Concatenated String (Using + operator): " + concatenatedPlusOperator);

        // Ask the user for an index number
        System.out.print("\nEnter an index number to retrieve the character: ");
        int index = scanner.nextInt();

        // Display the character at that index
        if (index >= 0 && index < concatenatedStringMethod.length()) {
            char characterAtIndex = concatenatedStringMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}
