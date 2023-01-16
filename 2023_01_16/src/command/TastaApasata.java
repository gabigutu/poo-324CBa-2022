package command;

public class TastaApasata extends ComandaDocument {

    private char key;
    public TastaApasata(char key) {
        this.key = key;
    }
    @Override
    void executa(Document document) {
        System.out.println("S-a apasat tasta " + key + " in documentul " + document.getNume());
        document.writeChar(key);
    }

    @Override
    void anuleaza(Document document) {
        System.out.println("Anuleaza ultima tasta din documentul " + document.getNume());
        document.removeLastChar();
    }
}
