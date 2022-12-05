import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File {

    public static void main(String[] args) {
        String fisier = null;
        try {
            Scanner scanner = new Scanner(new java.io.File(fisier));
            // ... IOException
        } catch (FileNotFoundException exception) {
            System.out.println("File not found exception: " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Null pointer la fisier: " + exception.getMessage());
        } catch (IOException exception) {
            // probleme la citirea datelor din fisier
        } catch (Exception ex) {
            // orice alt tip de exceptie
        }

        System.out.println("Mesaj de dupa");

    }
}
