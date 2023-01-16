package observer;

public class Newsletter {

    private Subscriber[] subscribers;
    private int index;

    public Newsletter() {
        subscribers = new Subscriber[100];
        index = 0;
    }

    public void abonare(Subscriber subscriber) {
        subscribers[index++] = subscriber;
    }

    public void trimiteEmail(String mesaj) {
        for (int i = 0; i < index; i++) {
            subscribers[i].primesteMesaj(mesaj);
        }
    }



}
