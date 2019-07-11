package service;

import model.Product;

import java.util.List;

public interface ProductService {
    void add(Product item);

    List<Product> getAll();
}
