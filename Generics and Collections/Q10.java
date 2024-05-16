import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        String s = "This is a test. This is only a test.";
        System.out.println(mostOccurringWords(s));
    }

    public static Map<String, Integer> mostOccurringWords(String s) {
        Map<String, Integer> wordFreq = new HashMap<>();
        List<String> mostOccurring = new ArrayList<>();
        int maxFreq = 0;

        // Split the string into words
        String[] words = s.split("\\s+");

        // Count the frequency of each word
        for (String word : words) {
            int count = wordFreq.getOrDefault(word, 0) + 1;
            wordFreq.put(word, count);

            // Update the most occurring words
            if (count > maxFreq) {
                maxFreq = count;
                mostOccurring.clear();
                mostOccurring.add(word);
            } else if (count == maxFreq) {
                mostOccurring.add(word);
            }
        }

        // Print the most occurring words and their frequency
        for (String word : mostOccurring) {
            System.out.println(word + ": " + maxFreq);
        }

        return wordFreq;
    }
}
