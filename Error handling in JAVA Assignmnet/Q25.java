import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");

        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input was not an integer. Please try again.");
        } finally {
            scanner.close();
        }
    }
}
