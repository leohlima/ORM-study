package com.example.spring2.repositories;

import com.example.spring2.entities.OrderItem;
import com.example.spring2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
