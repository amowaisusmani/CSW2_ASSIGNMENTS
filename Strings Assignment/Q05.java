import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter base string and number of concatenations
        System.out.println("Enter the base string:");
        String baseString = scanner.nextLine();

        System.out.println("Enter the number of concatenations:");
        int numConcatenations = scanner.nextInt();

        // Using StringBuilder
        System.out.println("Using StringBuilder...");
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilderResult = new StringBuilder(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuilderResult.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
        System.out.println("Time taken: " + durationStringBuilder + " milliseconds");
        System.out.println("Final string length: " + stringBuilderResult.length());

        // Using StringBuffer
        System.out.println("Using StringBuffer...");
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBufferResult = new StringBuffer(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBufferResult.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        System.out.println("Time taken: " + durationStringBuffer + " milliseconds");
        System.out.println("Final string length: " + stringBufferResult.length());

        // Comparison
        long timeDifference = Math.abs(durationStringBuilder - durationStringBuffer);
        String faster = (durationStringBuilder < durationStringBuffer) ? "StringBuilder" : "StringBuffer";
        System.out.println("Comparison: " + faster + " was faster than " +
                ((faster.equals("StringBuilder")) ? "StringBuffer" : "StringBuilder") +
                " by " + timeDifference + " milliseconds.");

        scanner.close();
    }
}
