package com.example.spring2.repositories;

import com.example.spring2.entities.Category;
import com.example.spring2.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
