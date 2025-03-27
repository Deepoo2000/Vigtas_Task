package com.example.TaskWithSpringBoot.service;

import com.example.TaskWithSpringBoot.dao.ProductRepository;
import com.example.TaskWithSpringBoot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public Optional<Product> find(int id) {
        return productRepo.findById(id);
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public void remove(int id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByCategory(int categoryId) {
        return productRepo.findByCategoryId(categoryId);
    }
}
