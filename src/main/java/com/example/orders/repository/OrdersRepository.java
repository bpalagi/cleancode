package com.example.orders.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orders.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Long> {
  
  Optional<Order> findById(Long id);

}
