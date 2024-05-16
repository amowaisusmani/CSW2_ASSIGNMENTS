

 import java.util.*;
// Student class
class Student {
    private String id;
    private String name;

    // Constructor
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

// Course class
class Course {
    private String code;
    private String title;

    // Constructor
    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    // Getter methods
    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}

// EnrollmentSystem interface
interface EnrollmentSystem {
    void enroll(Student student, Course course);
    void drop(Student student, Course course);
    void displayEnrollmentDetails();
}

// Enrollment class
class Enrollment implements EnrollmentSystem {
    // Use a Map to store enrollment details
    private Map<Student, List<Course>> enrollmentDetails = new HashMap<>();

    @Override
    public void enroll(Student student, Course course) {
        // Enroll the student in the course
        enrollmentDetails.computeIfAbsent(student, k -> new ArrayList<>()).add(course);
    }

    @Override
    public void drop(Student student, Course course) {
        // Drop the course for the student
        if (enrollmentDetails.containsKey(student)) {
            enrollmentDetails.get(student).remove(course);
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        // Display the enrollment details
        for (Map.Entry<Student, List<Course>> entry : enrollmentDetails.entrySet()) {
            System.out.println("Student ID: " + entry.getKey().getId() + ", Student Name: " + entry.getKey().getName());
            for (Course course : entry.getValue()) {
                System.out.println("Enrolled in Course Code: " + course.getCode() + ", Course Title: " + course.getTitle());
            }
        }
    }
}

// Main class
public class Q09 {
    public static void main(String[] args) {
        // Create instances of Student and Course
        Student student1 = new Student("1", "Student 1");
        Student student2 = new Student("2", "Student 2");
        Course course1 = new Course("CSE101", "Introduction to Computer Science");
        Course course2 = new Course("MTH101", "Calculus I");

        // Create an instance of Enrollment
        Enrollment enrollment = new Enrollment();

        // Enroll students in courses
        enrollment.enroll(student1, course1);
        enrollment.enroll(student2, course2);

        // Display the enrollment details
        enrollment.displayEnrollmentDetails();

        // Drop a course for a student
        enrollment.drop(student1, course1);

        // Display the updated enrollment details
        enrollment.displayEnrollmentDetails();
    }
}
