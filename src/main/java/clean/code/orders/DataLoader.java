package clean.code.orders;

import org.springframework.stereotype.Component;

import clean.code.orders.model.Order;
import clean.code.orders.repository.OrderRepository;
import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

  private final OrderRepository orderRepository;

  public DataLoader(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @PostConstruct
  private void loadData() {
    orderRepository.save(Order.builder().product("hammer").build());
    orderRepository.save(Order.builder().product("shovel").build());
  }
  
}
