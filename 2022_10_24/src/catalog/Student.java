package catalog;

public class Student {

    private String nume;
    private float media;
    int nrMatricol;
    static int nrStudenti;

    public Student() {
        this("Unknown",  -1);
        System.out.println("Creez un nou student");
    }

    public Student(String nume, float media) {
        this.nume = nume;
        this.media = media;
        nrStudenti++;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public void setMedia(float media) {
        this.media = Math.round(media);
    }

    public float getMedia() {
        return media;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    boolean aTrecut() {
        return media >= 5;
    }

    public void afiseazaStudent() {
        System.out.println("catalog.Student: " + this.nume + " are media " + media);
    }

    public static void afiseazaNumarStudenti() {
        System.out.println("Avem " + Student.nrStudenti);
//        System.out.println(this.nume);
    }


}
