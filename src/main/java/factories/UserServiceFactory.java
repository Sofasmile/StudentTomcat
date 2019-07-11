package factories;

import service.UserService;
import service.UserServiceImpl;

import java.util.Objects;

public class UserServiceFactory {
    private static UserService instance;
    private UserServiceFactory(){

    }
    public static UserService getInstance(){
        if(Objects.isNull(instance)){
            instance = new UserServiceImpl();
        }
        return instance;
    }
}
