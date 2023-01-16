package decorator;

public class FiintaCareFotosinteza extends Fiinta {

    private Fiinta fiinta;

    public FiintaCareFotosinteza(Fiinta fiinta) {
        this.fiinta = fiinta;
    }

    void fotosinteza() {
        System.out.println(fiinta + " fotosintetizeaza");
    }

    @Override
    void respira() {
        this.fiinta.respira();
    }
}
