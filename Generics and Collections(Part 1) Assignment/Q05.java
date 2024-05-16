class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private double totalMark;

    // Constructor
    public Student(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public double getTotalMark() {
        return totalMark;
    }

    // Overriding compareTo method of Comparable interface
    @Override
    public int compareTo(Student other) {
        return this.rn - other.rn;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", RN: " + rn + ", Total Mark: " + totalMark;
    }
}

public class Q05 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 3, 85.0),
            new Student("Bob", 1, 90.0),
            new Student("Charlie", 2, 88.0)
        };

        // Bubble sort
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Print sorted students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
