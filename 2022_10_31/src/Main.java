public class Main {

    public static void main(String[] args) {
//	    Vehicle vehicle = new Vehicle();
//        System.out.println("vehicle: " + vehicle);
//        System.out.println("vehicle: " + vehicle.toString());
//        System.out.println(vehicle);

        Vehicle vehicle2 = new Vehicle(3, "tricicleta");
        System.out.println("vehicle2: " + vehicle2);

        System.out.println("Instantiere car");
        Car car = new Car();
        System.out.println("Car: " + car);

        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle: " + bicycle);

        Vehicle vehicle3 = new Vehicle(3, "BatMobil");

        Vehicle newCar = new Car();
        ((Car)newCar).startEngineSuper();

        Vehicle fuelableCar = new Car();
        if (fuelableCar instanceof Car) {
            ((Car)fuelableCar).addFuel();
        } else {
            System.err.println("Cannot fuel car fuelableCar");
        }

        Vehicle fuelableBycicle = new Bicycle();
        if (fuelableBycicle instanceof Car) {
            ((Car)fuelableBycicle).addFuel();
        } else {
            System.err.println("Cannot fuel bicycle fuelableBycicle");
        }

        // example of abstraction
        Database database = new NoSQLDatabase();
        database.connect();
//        database.insert();
    // 200 lines of code

    }

}
