package factory;

public class Main {

    public static void main(String[] args) {
        Ferma ferma = new Ferma();
        Animal pisica = ferma.creeazaAnimal("pisica");
        System.out.println(pisica);
        Animal pisi = ferma.creeazaAnimal("pisi");
        System.out.println(pisi);
        Animal catel = ferma.creeazaAnimal("catel");
        System.out.println(catel);
        Animal catel1 = ferma.creeazaAnimal("catel");
        System.out.println(catel1);


    }
}
