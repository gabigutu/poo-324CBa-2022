import java.io.*;

public class Main {

    public static void main(String[] args) {
        String s1 = "Buna";
        String s2 = new String("ziua");
        String s3 = "Buna";
        String s4 = new String("Buna");
        System.out.println((s1==s2)); // false
        System.out.println((s1==s3)); // true
        System.out.println((s3==s4)); // false

        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true
        System.out.println("s3.compareTo(s4): " +(s3.compareTo(s4) == 0)); // true
        System.out.println(s2.matches("ziua.*")); // true
        System.out.println(s2.matches("ziua.+")); // false
        System.out.println(s2.matches("ziu[a-z]+")); // true
        System.out.println(s2.matches("ziu[0-9]+")); // false
        System.out.println(s2.matches("zi[a-z]{2}")); // true
        System.out.println(s2.matches("zi[a-z]{2}")); // true
        System.out.println(s2.matches("zi[a-z]{1}[b-z]{1}")); // false
        System.out.println(s2.matches("ziu[a-z]+$")); // false
        System.out.println(s2.matches("zi[a-z]{1,2}")); // true
        System.out.println(s2.matches("zi[a-z]{1,3}")); // true

        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        for (int i = 0; i < 10; i++) {
            sb.append("world ");
        }
        System.out.println(sb.toString().trim());

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("test.dat");
            for (int i = 1; i <= 10; i++)
                out.write(i);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

        FileInputStream in = null;
        int x;
        try {
            in = new FileInputStream("test.dat");
            while ((x = in.read()) != -1) // -1 semnifică finalul de
                System.out.print(x + " ");
            in.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        int nrMasini = 257;
        Masina masini[] = new Masina[nrMasini];
        for (int i = 0; i < nrMasini; i++) {
            masini[i] = new Masina("Marca" + i);
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("objects.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeInt(nrMasini);
            objectOutputStream.write(nrMasini);
            for (int i = 0; i < nrMasini; i++) {
                objectOutputStream.writeObject(masini[i]);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("objects.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            int nrM = objectInputStream.readInt();
            int nrM = objectInputStream.read(); // reads a byte
            for (int i = 0 ; i < nrM; i++) {
                Object o = objectInputStream.readObject();
                if (o instanceof Masina) {
                    Masina m = (Masina)o;
                    System.out.println(m);
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
