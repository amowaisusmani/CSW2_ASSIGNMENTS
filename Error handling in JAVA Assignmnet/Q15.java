public class Q15 {
    public static void main(String[] args) {
        try {
            // This block may throw NumberFormatException
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
            
            try {
                // This block may throw ArithmeticException
                num = num / 0;
                System.out.println(num);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Division by zero is not allowed.");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid number.");
        }
    }
}
