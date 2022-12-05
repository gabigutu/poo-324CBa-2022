public class ImpartireLaNegativException extends Exception {

    private int deimpartit;

    public ImpartireLaNegativException(int deimpartit) {
        super("Nu poti imparti la negativ. Ai incercut cu " + deimpartit);
        this.deimpartit = deimpartit;
    }

    static int impartire(int a, int b) throws ImpartireLaNegativException  {
        if (b < 0) {
            throw new ImpartireLaNegativException(b);
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            int x = impartire(5, 4);
            System.out.println("Rezultatul impartirii este: " + x);
            if (4 == 4) {
                throw new Exception("Test");
            }
        } catch (ImpartireLaNegativException e) {
            e.printStackTrace();
            System.out.println("Am primit ImpartireLaNegativException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Test exception");
        } finally {
            System.out.println("Mesaj de final");
        }

        try {
            System.out.println(4/0);
        } finally {
            System.out.println("Mesaj dupa impartire (z)");
        }

        System.out.println("Mesaj de final (2)");
    }
}
