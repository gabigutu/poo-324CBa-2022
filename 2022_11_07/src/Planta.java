public class Planta extends Fiinta implements BreathingCreature {
    @Override
    void traieste() {
        System.out.println("Plata cu numele " + name + " traieste");
    }

    @Override
    public void breathe() {
        System.out.println("Plata cu numele " + name + " respira");
    }
}
