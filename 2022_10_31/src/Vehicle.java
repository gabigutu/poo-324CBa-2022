public class Vehicle {

    protected int noOfWheels;
    protected String name;

    public Vehicle() {
        this(0, "Unknown");
        System.out.println("1) Apel constructor vehicle fara params");
    }

    public Vehicle(int noOfWheels, String name) {
        this.noOfWheels = noOfWheels;
        this.name = name;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    @Override
    public String toString() {
        return "Vehiculul are " + noOfWheels + " roti si se numeste " + name;
    }

    public void startEngine() {
        System.out.println("Vehicle started engine");
    }

}
