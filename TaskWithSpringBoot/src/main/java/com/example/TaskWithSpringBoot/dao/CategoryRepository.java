package com.example.TaskWithSpringBoot.dao;

import com.example.TaskWithSpringBoot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
