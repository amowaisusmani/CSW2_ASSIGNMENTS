class Student {
    private String name;
    private String rollNumber;
    private int age;

    // Constructor that accepts roll number as an integer
    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = Integer.toString(rollNumber);
        this.age = age;
    }

    // Constructor that accepts roll number as a string
    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }
}

public class Q01 {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Alice", 123, 20);
        Student student2 = new Student("Bob", "456", 22);

        // Invoke methods
        System.out.println("Student1: " + student1.getName() + ", Roll Number: " + student1.getRollNumber() + ", Age: " + student1.getAge());
        System.out.println("Student2: " + student2.getName() + ", Roll Number: " + student2.getRollNumber() + ", Age: " + student2.getAge());
    }
}
