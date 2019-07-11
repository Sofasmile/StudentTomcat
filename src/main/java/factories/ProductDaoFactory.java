package factories;

import dao.ProductDao;
import dao.ProductDaoImpl;

import java.util.Objects;

public class ProductDaoFactory {
    private static ProductDao instance;
    private ProductDaoFactory(){

    }
    public static ProductDao getInstance(){
        if(Objects.isNull(instance)){
            instance = new ProductDaoImpl();
        }
        return instance;
    }
}
