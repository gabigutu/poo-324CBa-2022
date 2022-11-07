import db.DatabaseConnector;
import db.GeneralConnector;
import db.MySQLConnector;
import db.NoSQLConnector;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Fiinta fiinta = new Fiinta();

        Om om = new Om("Vasile");
        om.saNascut();
        om.traieste();

        Animal animal = new Animal();
        animal.saNascut();
        animal.traieste();

        Fiinta om2 = new Om("Gigel");
        om2.saNascut();
        om2.traieste();
        if (om2 instanceof Om) {
            Om omRef = ((Om)om2);
            omRef.canta();
            omRef.seCulca();
            omRef.seTrezeste();
        }



        Fiinta animal2 = new Animal();
        animal2.saNascut();
        animal2.traieste();
        if (animal2 instanceof Om) {
            ((Om)animal2).canta();
        } else {
            System.err.println("Animalul nu poate canta");
        }
        if (animal2 instanceof Animal) {
            ((Animal) animal2).seCulca();
            ((Animal) animal2).seTrezeste();
        }

        Fiinta[] fiinte = new Fiinta[10];
        fiinte[0] = new Om("Maria");
        fiinte[1] = new Animal();
        fiinte[2] = new Planta();


        SleepingCreature sleepingCreature = new Animal();
        sleepingCreature.seCulca();
        ((Animal)sleepingCreature).saNascut();
        ((Animal)sleepingCreature).seTrezeste();
        ((Animal)sleepingCreature).seCulca();
        SleepingCreature sleepingCreature1 = new Om("George");

        DatabaseConnector databaseConnector = new NoSQLConnector();
        databaseConnector.connect();
        databaseConnector.inserRow(null);
        // ..
        databaseConnector.disconnect();

        GeneralConnector generalConnector = new NoSQLConnector();
        ((NoSQLConnector)generalConnector).connect();

        Object object = new Animal();
        ((Animal)object).seCulca();

        Animal[] animale = new Animal[3];
        animale[0] = new Animal(2, 100);
        animale[1] = new Animal(5, 200);
        animale[2] = new Animal(3, 150);
        for (int i = 0; i < 3; i++) {
            System.out.println(animale[i]);
        }

        Arrays.sort(animale);

        for (int i = 0; i < 3; i++) {
            System.out.println(animale[i]);
        }

        Om om1 = new Om("Gigi");
        try {
            Om om3 = (Om)om1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
