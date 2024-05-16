import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 1, 4, 9, 2, 6, 8};

        try {
            // Sorting the array
            Arrays.sort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));

            // Searching for an element
            int index = Arrays.binarySearch(array, 7);
            System.out.println("Index of 7 in the sorted array: " + index);

            // Accessing elements at various indices
            System.out.println("Element at index 2: " + array[2]);
            System.out.println("Element at index 5: " + array[5]);

            // Accessing an element beyond the bounds of the array
            System.out.println("Element at index 10: " + array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("The program continues execution without crashing.");
    }
}
