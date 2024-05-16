import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Request a word to search for
        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.next();

        // Request a word to replace it with
        System.out.print("Enter the word to replace it with: ");
        String replaceWord = scanner.next();

        // Find the first occurrence of the search word in the sentence
        int index = sentence.indexOf(searchWord);

        if (index != -1) {
            // Replace the word using substring operations and concatenation
            String modifiedSentence = sentence.substring(0, index) + replaceWord +
                    sentence.substring(index + searchWord.length());

            // Display the original and modified sentences
            System.out.println("\nOriginal Sentence: " + sentence);
            System.out.println("Modified Sentence: " + modifiedSentence);
        } else {
            // If the search word is not found in the sentence
            System.out.println("The word \"" + searchWord + "\" was not found in the sentence.");
        }

        scanner.close();
    }
}
