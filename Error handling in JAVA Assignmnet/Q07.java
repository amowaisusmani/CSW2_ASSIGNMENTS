public class Q07 {
    public static void main(String[] args) {
        String str = "1234";
        try {
            int num = convertToInt(str);
            System.out.println("The number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    public static int convertToInt(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Input string is not a valid integer");
        }
    }
}
