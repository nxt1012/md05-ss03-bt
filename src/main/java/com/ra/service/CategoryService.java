package com.ra.service;

import com.ra.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<Category> findAll();

    Category saveOrUpdate(Category category);

    Category findById(Long categoryId);

    void delete(Category category);
}
