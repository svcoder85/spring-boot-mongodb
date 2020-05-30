package io.springboot.mongodb.repositories;

import io.springboot.mongodb.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
