
interface Vehicle {
    void accelerate(int speed);
    void brake();
}

class Car implements Vehicle {
    @Override
    public void accelerate(int speed) {
        System.out.println("The car accelerates at " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("The car accelerates at " + speed + " km/h for " + duration + " seconds.");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate(int speed) {
        System.out.println("The bicycle accelerates at " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("The bicycle accelerates at " + speed + " km/h for " + duration + " seconds.");
    }

    @Override
    public void brake() {
        System.out.println("The bicycle is braking.");
    }
}

public class Q08 {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(60);
        car.accelerate(60, 5);
        car.brake();

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate(20);
        bicycle.accelerate(20, 10);
        bicycle.brake();
    }
}
