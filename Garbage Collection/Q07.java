public class Q07 {
    private String name;
    private int id;
    private String[] courses;

    public Q07(String name, int id, String[] courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses Enrolled:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Memory for student " + name + " (ID: " + id + ") successfully reclaimed.");
    }

    public static void main(String[] args) {
        // Create a sample student
        String[] courses = {"Mathematics", "Physics", "Computer Science"};
        Q07 student = new Q07("John Doe", 1001, courses);
        
        // Display student information
        student.displayInfo();
        
        // Trigger garbage collection
        System.gc();
        
        // Monitor memory usage
        Runtime runtime = Runtime.getRuntime();
        long freeMemoryBefore = runtime.freeMemory();
        long totalMemoryBefore = runtime.totalMemory();
        System.out.println("Free Memory before GC: " + freeMemoryBefore + " bytes");
        
        // Force garbage collection
        runtime.gc();
        
        // Monitor memory usage after garbage collection
        long freeMemoryAfter = runtime.freeMemory();
        long totalMemoryAfter = runtime.totalMemory();
        System.out.println("Free Memory after GC: " + freeMemoryAfter + " bytes");
        System.out.println("Memory Freed: " + (freeMemoryAfter - freeMemoryBefore) + " bytes");
        System.out.println("Total Memory: " + totalMemoryAfter + " bytes");
    }
}
