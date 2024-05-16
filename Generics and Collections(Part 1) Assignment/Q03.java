class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.speed, otherCar.speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}

public class Q03 {
    public static void main(String[] args) {
        Car car1 = new Car("Model1", "Red", 120);
        Car car2 = new Car("Model2", "Blue", 150);

        Car fasterCar = car1.compareTo(car2) > 0 ? car1 : car2;
        System.out.println("The faster car is: " + fasterCar);
    }
}
