package Singleton;

public class User {
    private int userId;
    private String email;
    private String first_name;
    private String last_name;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    // Constructor
    public User(int userId, String first_name, String last_name, String email) {
        this.userId = userId;
        this.first_name = first_name;
        this.last_name = last_name;

        this.email = email;
    }

    // toString() method to print user details
    @Override
    public String toString() {
        return "Singleton.User{" +
                "userId=" + userId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
