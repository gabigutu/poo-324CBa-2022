package decorator;

public class Main {

    public static void main(String[] args) {
        Cal cal = new Cal();
        cal.respira();
        // cal.doarme();
        FiintaCareDoarme calCareDoarme = new FiintaCareDoarme(cal);
        calCareDoarme.doarme();

        Trandafir trandafir = new Trandafir();
        trandafir.respira();
        // trandafir.doarme(); //
        FiintaCareFotosinteza trandafirFotosint = new FiintaCareFotosinteza(trandafir);
        trandafirFotosint.fotosinteza();

    }
}
