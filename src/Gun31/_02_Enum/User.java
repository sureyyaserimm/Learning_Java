package Gun31._02_Enum;

public class User {
    String username;
    Statu statu;
    Role role;

    public User(String username, Role role,Statu statu) {
        this.username = username;
        this.statu = statu;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", statu=" + statu +
                ", role=" + role +
                '}';
    }
}
