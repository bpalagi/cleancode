package com.example.orders.service;

import com.example.orders.model.Order;
import com.example.orders.repository.OrdersRepository;
import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class OrdersServiceImpl implements OrdersService {

  private final OrdersRepository ordersRepository;

  public List<Order> findAllOrders() {
    log.info("Finding all orders");
    return ordersRepository.findAll();
  }

  public Order findOrderById(Integer id) {
    log.info("Finding order by id: {}", id);
    return ordersRepository.findById(id).orElse(null);
  }  
}
