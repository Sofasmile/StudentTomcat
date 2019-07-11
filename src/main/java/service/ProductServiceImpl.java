package service;

import dao.ProductDao;
import factories.ProductDaoFactory;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao = ProductDaoFactory.getInstance();
    public void add(Product product) {
        productDao.add(product);
    }

    public List<Product> getAll() {
        return productDao.getAll();
    }
}
