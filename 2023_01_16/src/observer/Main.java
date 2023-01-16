package observer;

public class Main {

    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Subscriber vasile = new Subscriber("vasile@yahoo.com");
        newsletter.abonare(vasile);
        Subscriber gigel = new Subscriber("gigel@gmail.com");
        newsletter.abonare(gigel);
        Subscriber florinel = new Subscriber("florinel@hotmail.com");
        newsletter.abonare(florinel);

        newsletter.trimiteEmail("Bine ati venit");
        newsletter.trimiteEmail("Cod de reducere");
    }
}
