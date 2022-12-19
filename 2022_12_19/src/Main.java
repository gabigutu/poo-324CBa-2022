import java.util.*;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(100 * 1000);
        Student<Float> student1 = new Student("Vasilica");
//	    ArrayList arrayList = new ArrayList();
        ArrayList<Object> arrayList = new ArrayList();
	    arrayList.add(car1); // Car extends Object
	    arrayList.add(student1); // Student extends Object

        ArrayList<Car> cars = new ArrayList();
        cars.add(car1);
//        cars.add(student1);


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1); // Car extends Vehicle

        // HashMap
//        HashMap hashMap = new HashMap();
        HashMap<Object, Object> hashMap = new HashMap();
        hashMap.put(car1, student1);
        hashMap.put(student1, car1);

        Map<Student, Car> studentCarHashMap = new HashMap<>();
        studentCarHashMap.put(student1, car1);
//        studentCarHashMap.put(car1, student1);

        IDatabase database = new NoSQL(); // loose coupling
        database.connect("vasile", "parola");
        database.something();
        database.disconnect();
        Car returnedCar = studentCarHashMap.get(student1);
        if (returnedCar == car1) {
            System.out.println("Car1 is the same as returned car");
        }

        Car<Student> car2 = new Car(90 * 1000);
        car2.setDriver(student1);
        System.out.println(car2);
        BrilliantStudent brilliantStudent = new BrilliantStudent("Gigel");
        car2.setDriver(brilliantStudent);
        Student returnStudent = car2.getDriver();
        if (returnStudent == brilliantStudent) {
            System.out.println("ReturnedStudent is the same as BrilliantStudent");
        }
//        Car<Object> car3ObjectCar = new Car();

        Car[] otherCars = new Car[2];
        otherCars[0] = new Car(20);
        otherCars[1] = new Car(10);
        Arrays.sort(otherCars);
        for (int i = 0; i < 2; i++) {
            System.out.print(otherCars[i]);
        }
        System.out.println();


        Materie matematica = new Materie("Matematica");
        student1.<Materie>addMark(matematica, 8.4f);
//        student1.<Car>addMark(car1, 8.4f);
        Laborator laborator = new Laborator("POO", "Laborator 10");
        student1.<Laborator>addMark(laborator, 8.4f);
        HashMap<Materie, Double> materieDoubleHashMap = new HashMap<>();
        materieDoubleHashMap.put(matematica, 4.5);
        HashMap<Laborator, Float> laboratorFloatHashMap = new HashMap<>();
        Float float1 = 6.5f;
        laboratorFloatHashMap.put(laborator, float1);
        student1.addMarks2(materieDoubleHashMap);
        student1.addMarks2(laboratorFloatHashMap);
//        student1.addMarks3(materieDoubleHashMap);
//        student1.addMarks3(laboratorFloatHashMap);

//        List<Materie> materies = new ArrayList<Laborator>();

        List<Object> list = new ArrayList();
        list.add(car1);
        list.add(new Object());
        list.add(new Vehicle());
        list.add(new Student("Vasilica"));
        list.add(new BMW(993));
        student1.addVehicles(list);

    }
}
