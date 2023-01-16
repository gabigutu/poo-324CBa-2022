package builder;

public class UserBuilder {

    private User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder withUsername(String username) {
        this.user.setUsername(username);
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.user.setPassword(password);
        return this;
    }

    public UserBuilder withIsAdmin(boolean isAdmin) {
        this.user.setAdmin(isAdmin);
        return this;
    }

    public User build() {
        return user;
    }

}
