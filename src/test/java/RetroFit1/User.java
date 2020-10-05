package RetroFit1;

public class User {
    String id;
    String first_name;
    String last_name;
    String email;

    @Override
    public String toString() {
        return "RetroFit1.User [id=" + id + ", "
                + "first_name=" + first_name + ", "
                + "last_name=" + last_name + ", "
                + "email=" + email + "]";
    }
}