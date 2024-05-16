public class Q08 {
    public static void main(String[] args) {
        int number = -4;  // Change this to the number you want to find the square root of

        try {
            double result = Math.sqrt(number);
            if(Double.isNaN(result)) {
                throw new ArithmeticException("Cannot calculate square root of a negative number");
            }
            System.out.println("The square root of " + number + " is " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
