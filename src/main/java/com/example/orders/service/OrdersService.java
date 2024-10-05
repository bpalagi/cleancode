package com.example.orders.service;

import com.example.orders.model.Order;

public interface OrdersService {

  Order findOrderById(Integer id);
}
