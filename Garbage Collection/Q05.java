public class Q05 {
    private int integerValue;
    private double doubleValue;

    // Constructor
    public Q05() {
        integerValue = 0;
        doubleValue = 0.0;
    }

    // Method to initialize data members
    public void initialize(int intValue, double doubleValue) {
        this.integerValue = intValue;
        this.doubleValue = doubleValue;
    }

    // Method to set integer value
    public void setIntegerValue(int integerValue) {
        this.integerValue = integerValue;
    }

    // Method to set double value
    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    // Method to update both integer and double values
    public void updateValues(int intValue, double doubleValue) {
        this.integerValue += intValue;
        this.doubleValue += doubleValue;
    }

    // Method to get integer value
    public int getIntegerValue() {
        return integerValue;
    }

    // Method to get double value
    public double getDoubleValue() {
        return doubleValue;
    }

    public static void main(String[] args) {
        // Creating objects of DataObject class
        Q05 obj1 = new Q05();
        Q05 obj2 = new Q05();

        // Initializing and updating data members
        obj1.initialize(10, 5.5);
        obj2.initialize(20, 8.5);
        obj1.updateValues(5, 2.0);
        obj2.updateValues(10, 3.5);

        // Checking memory usage before making objects unreachable
        long initialMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used before making objects unreachable: " + initialMemory + " bytes");

        // Making objects unreachable by removing references
        obj1 = null;
        obj2 = null;

        // Requesting garbage collection
        System.gc();

        // Checking memory usage after garbage collection
        long finalMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used after garbage collection: " + finalMemory + " bytes");
    }
}
