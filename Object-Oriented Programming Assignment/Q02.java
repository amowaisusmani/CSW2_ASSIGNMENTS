

class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize the attributes
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area
    public double calculateArea() {
        return this.length * this.width;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}

// Main class
public class Q02 {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle rectangle = new Rectangle(5.0, 7.0);

        // Display the area and perimeter
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());

        // Set new values for the attributes
        rectangle.setLength(10.0);
        rectangle.setWidth(15.0);

        // Display the updated area and perimeter
        System.out.println("Updated area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Updated perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }
}
