package builder;

public class Main {

    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        userBuilder.withPassword("parola").withUsername("vasilica").withIsAdmin(false);
        userBuilder.withUsername("dadaa");
        User user = userBuilder.build();

        System.out.println(user);

        User user2 = new UserBuilder().
                withUsername("gigel").
                withPassword("parola123").
                withIsAdmin(true).
                build();
        System.out.println(user2);

        System.out.println(user);

        User vasile = new User();
        vasile.setPassword("parola");
        vasile.setUsername("vasile");


    }
}
