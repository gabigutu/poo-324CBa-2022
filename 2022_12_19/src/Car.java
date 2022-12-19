public class Car<S> extends Vehicle implements Comparable<Car> {

    private S driver;
    private int km;

    public Car(int km) {
        this.km = km;
    }

    public void setDriver(S driver) {
        this.driver = driver;
    }

    public S getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "driver=" + driver +
                ", km=" + km +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.km - o.km;
    }
}
