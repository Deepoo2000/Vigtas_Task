package com.example.TaskWithSpringBoot.service;

import com.example.TaskWithSpringBoot.dao.CategoryRepository;
import com.example.TaskWithSpringBoot.dao.ProductRepository;
import com.example.TaskWithSpringBoot.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    @Autowired
    private ProductRepository productRepo;

    public Optional<Category> find(int id) {
        return categoryRepo.findById(id);
    }

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    public void remove(int id) {
        if (productRepo.findByCategoryId(id).isEmpty()) {
            categoryRepo.deleteById(id);
        } else {
            throw new IllegalStateException("Cannot delete category with existing products");
        }
    }
}