package observer;

public class Subscriber {

    private String emailAddress;

    public Subscriber(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void primesteMesaj(String mesaj) {
        System.out.println(emailAddress + " a primit: " + mesaj);
    }
}
