package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private static final List<User> users = new ArrayList<>();
    public void add(User user) {
        users.add(user);
    }

    public List<User> getAll() {
        return users;
    }
}
