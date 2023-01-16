package singleton;

import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {

        FilesManager filesManager = FilesManager.getInstance();
        FilesManager filesManager1 = FilesManager.getInstance();
        System.out.println(filesManager);
        System.out.println(filesManager1);


    }
}
