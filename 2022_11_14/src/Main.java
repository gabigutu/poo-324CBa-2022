public class Main {

    // modified

    public static void main(String[] args) {
        Person vasile = new Person("Vasile");
        vasile.respira();
        Person.Hand leftHandVasile = vasile.new Hand("left", "Mana stanga");
        System.out.println(leftHandVasile);
        Person.showNoPersons();

        Person gigel = new Person("Gigel");
        Person.Hand rightHandGigel = gigel.new Hand("right", "Mana dreapta");
        System.out.println(rightHandGigel);
        Person.showNoPersons();

        Person.Head.headMethod();
//        gigel.new Hand("right", "Mana dreapta");
        Person.Head headVasile = new Person.Head(vasile);
        System.out.println(headVasile);
        headVasile.gandeste();
        Person.Head headGigel = new Person.Head(gigel);
        System.out.println(headGigel);
        headGigel.gandeste();

        Person.Something somethingFlorentina = new Person("Florentina").new Something();
        Person.SomethingStatic somethingStatic = new Person.SomethingStatic();
        Person.SomethingStatic.showStrComun();
        somethingStatic.showStrComunNonStatic();

        // something for testing


    }
}
