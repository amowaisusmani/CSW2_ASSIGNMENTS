import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return age == student.age && mark == student.mark && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}

public class Q04 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Alice", 20, 85));
        students.add(new Student("Bob", 21, 90));
        students.add(new Student("Charlie", 22, 95));

        // Display the list
        System.out.println("Student List: " + students);

        // Ask the user to enter a Student object and print the existence of the object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name, age and mark:");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int mark = scanner.nextInt();
        Student student = new Student(name, age, mark);
        System.out.println("Does the list contain the student? " + students.contains(student));

        // Remove a specified Student object
        students.remove(student);
        System.out.println("List after removal: " + students);

        // Count the number of objects present in the list
        System.out.println("Number of students in the list: " + students.size());
    }
}
