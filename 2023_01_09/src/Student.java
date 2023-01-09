public class Student implements Comparable<Student> {
    private String nume;
    private int varsta;

    public Student(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public int compareTo(Student o) {
//        return this.nume.compareTo(o.nume);
        return this.varsta - o.varsta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
