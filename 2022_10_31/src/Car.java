public class Car extends Vehicle {

    private String make;

    public Car() {
//        super(4, "masina");
        this("Fara marca");
        System.out.println("3) Apel constructor car fara params");
    }

    public Car(String make) {
        super();
        System.out.println("2) Apel constructor car cu param make");
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", name='" + name + '\'' +
                '}' + super.toString();
    }

    public void startEngine() {
        System.out.println("Car started engine");
    }

    public void startEngineSuper() {
        super.startEngine();
    }

    public void addFuel() {
        System.out.println("Adding fuel to car");
    }
}
