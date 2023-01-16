package singleton;

public class FilesManager {

    private  String name;
    private static FilesManager filesManager = null;

    public FilesManager(String name) {
        this.name = name;
    }

    static FilesManager getInstance() {
        if (filesManager == null) {
            filesManager = new FilesManager("Sistem de fisiere");
        }
        return filesManager;
    }

//    public String toString() {
//        return "FilesManager: " + name;
//    }


}
