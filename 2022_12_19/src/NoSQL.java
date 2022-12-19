public class NoSQL implements IDatabase {
    @Override
    public void connect(String username, String password) {
        System.out.println("NoSQL connected with " + username + " and " + password );
    }

    @Override
    public void disconnect() {
        System.out.println("NoSQL disconnected ");
    }

    @Override
    public void something() {
        // nothing
    }
}
