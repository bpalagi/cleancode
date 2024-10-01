package com.example.orders.service;

import com.example.orders.model.Order;

public interface OrdersService {

  public Order findById(Long id);
}
