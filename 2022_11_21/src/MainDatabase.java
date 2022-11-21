public class MainDatabase {

    public static void main(String[] args) {
        IDatabase mySQLDatabase = new MySQLDatabase();
        mySQLDatabase.connect();
        mySQLDatabase.disconnect();

        // class Anonymous implements IDatabase
        IDatabase noSQLDatabase = new IDatabase() {
            @Override
            public void connect() {
                System.out.println("NoSQL connected");
            }

            @Override
            public void disconnect() {
                System.out.println("NoSQL disconnected");
            }
        };
        noSQLDatabase.connect();
        noSQLDatabase.disconnect();

        // class Anonymous extends AbstractClass
        AbstractClass objDerivedFromAbsClass = new AbstractClass() {
            @Override
            void something() {
                System.out.println("Something from anon class extended from abstract class ");
            }
        };
        objDerivedFromAbsClass.something();

        startEngine(new Vehicle() {
            String name;

//            public constructor(String name) { // ?
//
//            }
            @Override
            public void start() {
                System.out.println("Engine started");
            }

            @Override
            public void stop() {
                System.out.println("Engine stopped");
            }
        });
    }

    public static void startEngine(Vehicle vehicle) {
        vehicle.start();
    }
}
