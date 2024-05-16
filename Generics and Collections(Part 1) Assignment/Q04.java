public class Q04 implements Comparable<Q04> {
    String name;
    int rn;
    int totalMark;

    public Q04(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    @Override
    public int compareTo(Q04 other) {
        return Integer.compare(this.totalMark, other.totalMark);
    }

    public static Q04 linearSearch(Q04[] students, String name) {
        for (Q04 student : students) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Q04[] students = new Q04[3];
        students[0] = new Q04("Alice", 1, 85);
        students[1] = new Q04("Bob", 2, 90);
        students[2] = new Q04("Charlie", 3, 95);

        Q04 foundStudent = linearSearch(students, "Bob");
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.name);
        } else {
            System.out.println("Student not found");
        }
    }
}
