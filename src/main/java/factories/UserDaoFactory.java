package factories;

import dao.UserDao;
import dao.UserDaoImpl;

import java.util.Objects;

public class UserDaoFactory {
    private static UserDao instance;
    private UserDaoFactory(){

    }
    public static UserDao getInstance(){
        if(Objects.isNull(instance)){
            instance = new UserDaoImpl();
        }
        return instance;
    }
}
