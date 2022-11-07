package db;

public class NoSQLConnector implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("NoSQL connected");
    }

    @Override
    public void disconnect() {
        System.out.println("NoSQL disconnected");
    }

    @Override
    public void inserRow(Object object) {
        System.out.println("NoSQL inserted row");
    }

    @Override
    public void start() {
        System.out.println("NoSQL starts");
    }
}
