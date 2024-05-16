import java.util.Scanner;
import java.lang.Math;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            double number = scanner.nextDouble();
            
            // Logarithmic function
            double logValue = Math.log(number);
            System.out.println("Logarithm of " + number + " is " + logValue);
            
            // Trigonometric function
            double sinValue = Math.sin(number);
            System.out.println("Sine of " + number + " is " + sinValue);
            
            // Algebraic function
            double sqrtValue = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + sqrtValue);
            
        } catch (NullPointerException e) {
            System.out.println("Error: Null value encountered. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
