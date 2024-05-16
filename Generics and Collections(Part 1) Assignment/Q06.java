class Animal {
    private String name;
    private String color;
    private String type; // pet or wild

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

public class Q06 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog", "Black", "Pet");
        Animal animal2 = new Animal("Lion", "Golden", "Wild");

        System.out.println("The hashcode for animal1 (Dog) is: " + animal1.hashCode());
        System.out.println("The hashcode for animal2 (Lion) is: " + animal2.hashCode());
    }
}
