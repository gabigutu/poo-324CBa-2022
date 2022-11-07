package db;

public class MySQLConnector implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("MySQL connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnected");
    }

    @Override
    public void inserRow(Object object) {
        System.out.println("MySQL inserted row");
    }

    @Override
    public void start() {
        System.out.println("MySQL starts");
    }
}
