import java.io.FileNotFoundException;

public class Main {

    static int impartire(int a, int b) throws FileNotFoundException, ArithmeticException {
        if (b == 0) {
            throw new FileNotFoundException("Nu pot imparti la zero!");
        }
        if (b == 1) {
            throw new ArithmeticException("Nu pot imparti la unu!");
        }
        return a/b;
    }
    public static void main(String[] args) {
        try {
            System.out.println(impartire(4, 0));
        } catch (FileNotFoundException ex) {
            System.out.println("Prima: Nu am putut face impartirea: " + ex.getMessage());
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            System.out.println("A doua: Nu am putut face impartirea: " + ex.getMessage());
        }

        System.out.println("Mesaj dupa impartire");

    }
}
