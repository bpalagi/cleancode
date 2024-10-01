package com.example.orders.service;

import com.example.orders.model.Order;
import com.example.orders.repository.OrdersRepository;

public class OrdersServiceImpl implements OrdersService {

  OrdersRepository ordersRepository;

  @Override
  public Order findById(Long id) {
    return ordersRepository.findById(id).orElse(null);
  }
  
}
