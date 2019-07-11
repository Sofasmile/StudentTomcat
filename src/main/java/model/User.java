package model;

public class User {
    private static Long lastId = 1L;
    private Long id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.id = lastId;
        this.email = email;
        this.password = password;
        lastId++;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
