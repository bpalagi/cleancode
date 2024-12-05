package clean.code.orders.service;

import java.util.List;

import clean.code.orders.model.Order;
import clean.code.orders.model.dto.CreateOrderDto;

public interface OrderService {
  
  public List<Order> getOrders();

  public void createOrder(CreateOrderDto orderDto);
  
}
