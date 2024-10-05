package com.example.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orders.model.Order;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
}
