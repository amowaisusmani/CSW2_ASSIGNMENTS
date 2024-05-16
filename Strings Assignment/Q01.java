public class Q01 {
    public static void main(String[] args) {
        // Using string literals
        String str1 = "hello";
        String str2 = "hello";

        // Using new keyword
        String str3 = new String("hello");
        String str4 = new String("hello");

        // Memory usage implications
        System.out.println("Memory address of str1: " + System.identityHashCode(str1));
        System.out.println("Memory address of str2: " + System.identityHashCode(str2));
        System.out.println("Memory address of str3: " + System.identityHashCode(str3));
        System.out.println("Memory address of str4: " + System.identityHashCode(str4));

        // String comparison
        System.out.println("Using string literals:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same memory reference)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same content)

        System.out.println("\nUsing new keyword:");
        System.out.println("str3 == str4: " + (str3 == str4)); // false (different memory reference)
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true (same content)
    }
}
