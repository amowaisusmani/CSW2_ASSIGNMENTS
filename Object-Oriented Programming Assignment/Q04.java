
 class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop Model: " + this.model + ", Price: " + this.price;
    }
}

public class Q04 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setModel("Dell Inspiron");
        laptop.setPrice(700.00);
        System.out.println(laptop.toString());
    }
}
