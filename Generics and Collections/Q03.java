import java.util.*;

class Car implements Comparable<Car> {
    private int modelNo;
    private String name;
    private int stock;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.stock, otherCar.stock);
    }

    @Override
    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
}

public class Q03 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2013, "creta", 10));
        cars.add(new Car(2020, "MG", 13));
        cars.add(new Car(2018, "Kia", 20));
        cars.add(new Car(2017, "Audi", 45));
        cars.add(new Car(2015, "BMW", 55));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
