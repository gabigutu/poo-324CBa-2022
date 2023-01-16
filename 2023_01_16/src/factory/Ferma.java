package factory;

public class Ferma { // Factory

    private Animal animale[];
    private int index = 0;

    public Ferma() {
        this.animale = new Animal[100];
    }

    public Animal creeazaAnimal(String tip) {
        Animal animal = null;
        switch (tip) {
            case "pisica":
            case "pisi":
            case "pisicuta":
                animal = new Pisica();
                this.animale[index++] = animal;
                break;
            case "caine":
            case "catel":
                animal = new Caine();
                this.animale[index++] = animal;
                break;
        }
        return animal;
    }

}
