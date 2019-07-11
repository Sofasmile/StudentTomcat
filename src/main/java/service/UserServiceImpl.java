package service;

import dao.UserDao;
import factories.UserDaoFactory;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = UserDaoFactory.getInstance();

    public void add(User user) {
        userDao.add(user);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }
}
