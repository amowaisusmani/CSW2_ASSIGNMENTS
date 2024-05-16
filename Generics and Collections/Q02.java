import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class ArrayListUser {
    ArrayList<User> users;

    // Constructor
    public ArrayListUser() {
        users = new ArrayList<>();
    }

    // Method to add User
    public void addUser(User user) {
        users.add(user);
    }

    // Method to print Users
    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    // Method to sort Users by age
    public void sortUsersByAge() {
        Collections.sort(users, Comparator.comparing(User::getAge));
    }
}

public class Q02 {
    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();

        arrayListUser.addUser(new User("Alice", 25));
        arrayListUser.addUser(new User("Bob", 20));
        arrayListUser.addUser(new User("Charlie", 22));

        System.out.println("Before sorting:");
        arrayListUser.printUsers();

        arrayListUser.sortUsersByAge();

        System.out.println("\nAfter sorting:");
        arrayListUser.printUsers();
    }
}
