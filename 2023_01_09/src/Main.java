import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Ana");
        set.add("Maria");
        set.add("Andrei");
        set.add("Mihai");
        set.add("Ana");
        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String nume = iterator.next();
            System.out.print(nume + " ");
        }
        System.out.println();

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Ana");
        linkedHashSet.add("Maria");
        linkedHashSet.add("Andrei");
        linkedHashSet.add("Mihai");
        linkedHashSet.add("Ana");
        System.out.println(linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ana");
        treeSet.add("Maria");
        treeSet.add("Andrei");
        treeSet.add("Mihai");
        treeSet.add("Ana");
        System.out.println(treeSet);

        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("Vasile", 22));
        studentSet.add(new Student("Gigel", 21));
        studentSet.add(new Student("Popescu", 23));
        System.out.println(studentSet);


        Set<Car> carSet = new TreeSet<>(new CarComparator());
        carSet.add(new Car("Dacia", "Logan", 2000));
        carSet.add(new Car("Tesla", "Model3", 50 * 1000));
        carSet.add(new Car("Daewoo", "Matiz", 200));
        System.out.println(carSet);

        List<String> list = new ArrayList<>();
        list.add("Ana");
        list.add("Maria");
        list.add("Andrei");
        list.add("Mihai");
        list.add("Ana");
        System.out.println(list);
//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()) {
//            String nume = iterator.next();
//            System.out.print(nume + " ");
//        }
//        System.out.println();

        Queue<String> queue = new LinkedList<>();
        queue.offer("rosu");
        queue.offer("verde");
        queue.offer("albastru");
        // rosu, verde, albastru, ...
        while(queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();

        Queue<Student> studentQueue = new PriorityQueue<>();
        studentQueue.offer(new Student("Vasile", 40));
        studentQueue.offer(new Student("Popescu", 15));
        studentQueue.offer(new Student("Zaharia", 22));
        System.out.println(studentQueue);
        Iterator<Student> studentIterator = studentQueue.iterator();
        System.out.println("=== Cu iterator: ===");
        while(studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student);
        }
        System.out.println("=== Cu remove: ===");
        while(studentQueue.size() > 0) {
            System.out.println(studentQueue.remove() + " ");
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Vasile", 10);
        map.put("Popescu", 9);
        map.put("Gigel", 6);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }


    }
}
