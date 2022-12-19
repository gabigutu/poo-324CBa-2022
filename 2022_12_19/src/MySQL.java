public class MySQL implements IDatabase{
    @Override
    public void connect(String username, String password) {
        System.out.println("MySQL connected with " + username + " and " + password );
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnected");
    }

    @Override
    public void something() {
        this.somethingMySQLSpecific();
    }

    private void somethingMySQLSpecific() {

    }

}
