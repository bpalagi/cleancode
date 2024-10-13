package com.example.orders.service;

import java.util.List;

import com.example.orders.model.Order;

public interface OrdersService {

  List<Order> findAllOrders();
  
  Order findOrderById(Integer id);
}
