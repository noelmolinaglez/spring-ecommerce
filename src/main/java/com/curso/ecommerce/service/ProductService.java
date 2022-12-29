package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Product;

import java.util.Optional;

public interface ProductService {
    Product save(Product product);
    Optional<Product> get(Long id);
    void update(Product product);
    void delete(Long id);

}
