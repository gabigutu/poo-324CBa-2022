package builder;

public class User {

    private String username;
    private String password;
    private String email;
    private boolean activated;
    private boolean isAdmin;
    private boolean premiumAccount;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setPremiumAccount(boolean premiumAccount) {
        this.premiumAccount = premiumAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", activated=" + activated +
                ", isAdmin=" + isAdmin +
                ", premiumAccount=" + premiumAccount +
                '}';
    }
}
