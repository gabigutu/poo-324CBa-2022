public class Person {

    String name;
    static int noPersons = 0;

    public Person(String name) {
        this.name = name;
        Person.noPersons++;
    }

    static void showNoPersons() {
        System.out.println("No persons: " + Person.noPersons);
//        System.out.println(this.name);
    }

    public void respira() {
        System.out.println("Persoana " + name + " respira");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    class Hand {

        String type;
        String name;
//        static int noHands = 0;

        public Hand(String type, String name) {
            this.type = type;
            this.name = name;
        }

//        static void methodStatic() { }

        @Override
        public String toString() {
            return "Hand{" +
                    "type='" + type + '\'' +
                    ", name='" + name + '\'' +
                    '}' + " for person " + Person.this.name;
        }
    }

    static class Head {

        Person person;

        public Head(Person person) {
            this.person = person;
            System.out.println("New head created for " + person.name);
        }

        public void gandeste() {
            System.out.println("This head thinks " + person.name);
        }

        public static void headMethod() {
            System.out.println("Static method from head class");
        }

        @Override
        public String toString() {
            return "Head{" +
                    "person=" + person +
                    '}';
        }
    }

    class Something {

    }

    static class SomethingStatic {
        static String strComun;

        public static void showStrComun() {
            System.out.println("str comun: " + strComun);
        }

        public void showStrComunNonStatic() {
            System.out.println("str comun: " + strComun);
        }
    }

}
