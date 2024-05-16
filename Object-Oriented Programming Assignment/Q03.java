
 // Point class
class Point {
    private double x;
    private double y;

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    // Getter methods
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Setter methods
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

// Main class
public class Q03 {
    public static void main(String[] args) {
        // Create an object of the Point class
        Point point1 = new Point(5.0, 7.0);

        // Create a copy of point1
        Point point2 = new Point(point1);

        // Display the initial values
        System.out.println("Initial values of point1: " + point1.getX() + ", " + point1.getY());
        System.out.println("Initial values of point2: " + point2.getX() + ", " + point2.getY());

        // Modify point1
        point1.setX(10.0);
        point1.setY(15.0);

        // Display the updated values of point1 and the values of point2
        System.out.println("Updated values of point1: " + point1.getX() + ", " + point1.getY());
        System.out.println("Values of point2: " + point2.getX() + ", " + point2.getY());
    }
}
