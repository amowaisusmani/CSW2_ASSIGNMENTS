import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q02 {
    public static void main(String[] args) {
        try {
            String str = "aB3cD4eF5gH6";
            displayNumeric(str);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayNumeric(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty");
        }

        Pattern pattern = Pattern.compile("(?i)([bcdfghj-np-tv-z][aeiou][0-9])");
        Matcher matcher = pattern.matcher(str);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Numeric character '" + matcher.group().charAt(2) + "' is preceded by a vowel and a consonant.");
            found = true;
        }

        if (!found) {
            System.out.println("No numeric characters found in the string that are preceded by a vowel and a consonant.");
        }
    }
}
