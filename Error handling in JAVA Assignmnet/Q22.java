// Custom Checked Exception
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

// Main class
public class Q22 {
    public static void main(String[] args) {
        try {
            checkCondition(false);
        } catch (CustomCheckedException e) {
            System.out.println("Caught CustomCheckedException: " + e.getMessage());
        }
    }

    public static void checkCondition(boolean condition) throws CustomCheckedException {
        if (!condition) {
            throw new CustomCheckedException("Condition is false");
        }
    }
}
