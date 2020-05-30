package io.springboot.mongodb.services;

import io.springboot.mongodb.commands.ProductForm;
import io.springboot.mongodb.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
