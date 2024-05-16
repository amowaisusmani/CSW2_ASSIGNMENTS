
 // College class
class College {
    private String collegeName;
    private String collegeLoc;

    // Constructor
    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    // Getter methods
    public String getCollegeName() {
        return this.collegeName;
    }

    public String getCollegeLoc() {
        return this.collegeLoc;
    }
}

// Student class
class Student {
    private int studentId;
    private String studentName;
    private College college;

    // Constructor
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    // Method to display student info
    public void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("College Name: " + this.college.getCollegeName());
        System.out.println("College Location: " + this.college.getCollegeLoc());
    }
}

// Main class
public class Q05 {
    public static void main(String[] args) {
        // Instantiate two College objects
        College college1 = new College("College 1", "Location 1");
        College college2 = new College("College 2", "Location 2");

        // Instantiate two Student objects
        Student student1 = new Student(1, "Student 1", college1);
        Student student2 = new Student(2, "Student 2", college2);

        // Display the information of all colleges and all students
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
