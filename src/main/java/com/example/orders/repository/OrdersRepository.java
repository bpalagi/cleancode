package com.example.orders.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orders.model.Order;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface OrdersRepository extends JpaRepository<Order, Long> {
  
  Optional<Order> findById(Long id);

  // custom query
  @Query("SELECT o FROM Order o WHERE o.customerId = :customerId")
  List<Order> findByCustomerId(@Param("customerId") Long customerId);
}
