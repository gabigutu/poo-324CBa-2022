package db;

public interface DatabaseConnector extends GeneralConnector {

    void connect();
    void disconnect();

    void inserRow(Object object);

}
