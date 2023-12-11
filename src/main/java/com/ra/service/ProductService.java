package com.ra.service;

import com.ra.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product saveOrUpdate(Product product);

    Product getProductById(Long id);

    void delete(Product product);
}
