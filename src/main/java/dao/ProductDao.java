package dao;

import model.Product;

import java.util.List;

public interface ProductDao {
    void add(Product item);

    List<Product> getAll();
}
