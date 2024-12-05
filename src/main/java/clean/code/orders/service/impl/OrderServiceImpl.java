package clean.code.orders.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import clean.code.orders.model.Order;
import clean.code.orders.model.dto.CreateOrderDto;
import clean.code.orders.repository.OrderRepository;
import clean.code.orders.service.OrderService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;

  @Override
  public List<Order> getOrders() {
    return orderRepository.findAll();
  }

  @Override
  public void createOrder(CreateOrderDto orderDto) {
    Order order = Order.builder().product(orderDto.getProduct()).build();
    orderRepository.save(order);
  }
}
