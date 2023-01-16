package decorator;

public class FiintaCareDoarme extends Fiinta {

    private Fiinta fiinta;

    public FiintaCareDoarme(Fiinta fiinta) {
        this.fiinta = fiinta;
    }

    void doarme() {
        System.out.println(fiinta + " doarme");
    }

    @Override
    void respira() {
        this.fiinta.respira();
    }
}
