public class Car {

    private String make;
    private String model;
    private int price;

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
