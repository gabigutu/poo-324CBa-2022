package command;

public class Main {

    public static void main(String[] args) {
        Document tema2 = new Document("Tema 2");
        Document proiect = new Document("Proiect");

        ModificareStilText stilText_bold = new ModificareStilText("Bold");
        ModificareStilText stilText_italic = new ModificareStilText("Italic");
        ModificareStilText stilText_underline = new ModificareStilText("Underline");

        TastaApasata tastaApasata_S = new TastaApasata('S');
        tastaApasata_S.executa(tema2);
        System.out.println(tema2);
        tastaApasata_S.executa(proiect);
        System.out.println(proiect);

        stilText_bold.executa(tema2);
        System.out.println(tema2);
        stilText_italic.executa(tema2);
        System.out.println(tema2);
        stilText_bold.anuleaza(tema2);
        System.out.println(tema2);


        TastaApasata tastaApasata_a = new TastaApasata('a');
        tastaApasata_a.executa(tema2);
        System.out.println(tema2);

        tastaApasata_a.anuleaza(tema2);
        System.out.println(tema2);
        stilText_bold.executa(proiect);
        System.out.println(proiect);
    }
}
