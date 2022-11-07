public class Om extends Fiinta implements SleepingCreature, BreathingCreature, Cloneable {

    public Om(String name) {
        this.name = name;
    }

    @Override
    void traieste() {
        System.out.println("Omul " + name + " traieste");
    }

    void canta() {
        System.out.println("Omul " + name + " canta");
    }

    @Override
    public void seCulca() {
        System.out.println("Omul " + name + " se culca");
    }

    @Override
    public void seTrezeste() {
        System.out.println("Omul " + name + " se trezeste");
    }

    @Override
    public void breathe() {
        System.out.println("Omul " + name + " respira");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Om omNou = new Om(this.name);
        return omNou;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((Om)obj).name;
    }
}
