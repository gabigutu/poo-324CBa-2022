import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Student<Z> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public <X extends Materie> void addMark(X subject, Z grade) {
        System.out.println("Student " + name + " received " + grade + " at " + subject);
    }

    public <X extends Materie, Y extends Number> void addMarks(Map<X, Y> marks) {

    }

    public void addMarks2(Map<? extends Materie, ? extends Number> marks) {

    }

    public void addMarks3(Map<Materie, Number> marks) {

    }

    public void addVehicles(List<? super Car> vehicles) {
        Iterator iterator = vehicles.iterator();
        while(iterator.hasNext()) {
            Object elem = iterator.next();
            if (elem instanceof Car) {
                ((Car)elem).getDriver();
            }
            System.out.println("Element for student " + name + ": " + elem);
        }
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
