package command;

public class ModificareStilText extends ComandaDocument {

    private String stil;

    public ModificareStilText(String stil) {
        this.stil = stil;
    }
    @Override
    void executa(Document document) {
        System.out.println("Aplica modificare text " + stil + " pe documentul " + document.getNume());
        document.addTextStyle(stil);
    }

    @Override
    void anuleaza(Document document) {
        System.out.println("Anuleaza modificare text " + stil + " de pe documentul " + document.getNume());
        document.removeTextStyle(stil);
    }
}
