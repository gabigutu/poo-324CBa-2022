public class Animal extends Fiinta implements SleepingCreature, BreathingCreature, Comparable, Cloneable {

    int age;
    int weight;

    Animal() {
        this(-1, -1);
    }

    Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    void traieste() {
        System.out.println("Un animal cu numele " + name + " traieste");
    }

    @Override
    public void seCulca() {
        System.out.println("Animalul " + name + " se culca");
    }

    @Override
    public void seTrezeste() {
        System.out.println("Animalul " + name + " se trezeste");
    }

    @Override
    public void breathe() {
        System.out.println("Animalul " + name + " respira");
    }

    @Override
    public int compareTo(Object o) {
        Animal receivedAnimal = (Animal)o;
        if (receivedAnimal.age == this.age && receivedAnimal.weight == this.weight) return 0;
        if (receivedAnimal.age > this.age) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Animal animal = new Animal(this.age, this.weight);
        animal.name = "Oita Dolly"; // ...
        return animal;
    }
}
