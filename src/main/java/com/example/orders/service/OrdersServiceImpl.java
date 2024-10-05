package com.example.orders.service;

import com.example.orders.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
@Service
public class OrdersServiceImpl implements OrdersService {

  public Order findById(Long id) {
    return Order.builder().id(id).customerId(1122L).build();
  }  
}
