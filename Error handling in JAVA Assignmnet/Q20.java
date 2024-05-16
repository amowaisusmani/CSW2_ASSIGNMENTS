public class Q20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            traverseArray(array, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array traversal completed.");
        }
    }

    public static void traverseArray(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        // Print the element at the current index
        System.out.println("Element at index " + index + " is " + array[index]);
        
        // Recursively call the function for the next index
        traverseArray(array, index + 1);
    }
}
