import java.util.ArrayList;

public class Q06 {
    public static void main(String[] args) {
        ArrayList<Object> objectList = new ArrayList<>();
        
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            objectList.add(new byte[1024]); // Creating 1KB byte arrays
            printMemoryInfo();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + (endTime - startTime) + " ms");
    }
    
    public static void printMemoryInfo() {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;
        long currentTime = System.currentTimeMillis();
        
        System.out.println("Timestamp: " + currentTime +
                           ", Heap Size: " + totalMemory +
                           ", Free Memory: " + freeMemory +
                           ", Used Memory: " + usedMemory);
    }
}
