public class Q18 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};  // Change this to your array
        try {
            traverseArray(array, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Reached the end of the array");
        }
    }

    public static void traverseArray(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }

        System.out.println("Element at index " + index + " is " + array[index]);

        // Recursively call the function for the next index
        traverseArray(array, index + 1);
    }
}
