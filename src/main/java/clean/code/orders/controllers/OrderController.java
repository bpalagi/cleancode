package clean.code.orders.controllers;

import clean.code.orders.model.Order;
import clean.code.orders.model.dto.CreateOrderDto;
import clean.code.orders.service.OrderService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @GetMapping("/orders")
  public ResponseEntity<List<CreateOrderDto>> getOrders() {
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    List<CreateOrderDto> allOrders = orderService.getOrders().stream().map(Order::toDto).toList();
    if (allOrders == null || allOrders.isEmpty()) {
        logger.warn("No orders found");
        return ResponseEntity.noContent().build();
    }
    return ResponseEntity.ok(allOrders);
  }
  
  @PostMapping("/create-order")
    public ResponseEntity<CreateOrderDto> createOrder(@RequestBody CreateOrderDto orderDto) {
        orderService.createOrder(orderDto);
        return ResponseEntity.ok(orderDto);
    }
}
