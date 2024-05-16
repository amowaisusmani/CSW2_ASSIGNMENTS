public class Q02 {

    public static void main(String[] args) {
        // Demonstrating String immutability
        String str1 = "Hello";
        String str2 = str1.concat(" World");

        // str1 remains unchanged
        System.out.println("Original String: " + str1);
        System.out.println("Concatenated String: " + str2);

        // Demonstrating CharSequence interface usage
        CharSequence charSeq = "Java is awesome";

        // Length of the CharSequence
        System.out.println("Length of the CharSequence: " + charSeq.length());

        // Accessing characters using charAt()
        System.out.println("Character at index 2: " + charSeq.charAt(2));

        // Subsequence from index 5 to 10
        CharSequence subSeq = charSeq.subSequence(5, 10);
        System.out.println("Subsequence from index 5 to 10: " + subSeq);

        // Using StringBuilder to modify CharSequence (not possible directly with String)
        StringBuilder stringBuilder = new StringBuilder(charSeq);
        stringBuilder.append(", and immutable");
        CharSequence modifiedSeq = stringBuilder;
        System.out.println("Modified CharSequence: " + modifiedSeq);
    }
}
