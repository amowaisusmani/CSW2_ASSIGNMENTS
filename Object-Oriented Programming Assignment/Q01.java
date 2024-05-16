

class Car {
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter methods
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

// CarTester class
class Q01 {
    public static void main(String[] args) {
        // Instantiate two instances of the Car class
        Car myCar1 = new Car("Toyota", "Corolla");
        Car myCar2 = new Car(null, null);

        // Print the initial make and model of both cars
        System.out.println("Initial make and model of myCar1: " + myCar1.getMake() + ", " + myCar1.getModel());
        System.out.println("Initial make and model of myCar2: " + myCar2.getMake() + ", " + myCar2.getModel());

        // Set new values for myCar2
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Print the updated make and model
        System.out.println("Updated make and model of myCar2: " + myCar2.getMake() + ", " + myCar2.getModel());
    }
}
