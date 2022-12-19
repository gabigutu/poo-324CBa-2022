public class Laborator extends Materie {

    private String name;

    public Laborator(String name, String name1) {
        super(name);
        this.name = name1;
    }

    @Override
    public String toString() {
        return "Laborator{" +
                "name='" + name + '\'' +
                ", materie='" + super.name + '\'' +
                '}';
    }
}
