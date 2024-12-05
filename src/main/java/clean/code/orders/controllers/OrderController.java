package clean.code.orders.controllers;

import clean.code.orders.model.Order;
import clean.code.orders.model.dto.CreateOrderDto;
import clean.code.orders.service.OrderService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @GetMapping("/orders")
  public ResponseEntity<List<Order>> getOrders() {
    List<Order> allOrders = orderService.getOrders();
    return ResponseEntity.ok(allOrders);
  }
  
  @PostMapping("/create-order")
    public ResponseEntity<CreateOrderDto> createOrder(CreateOrderDto orderDto) {
        orderService.createOrder(orderDto);
        return ResponseEntity.ok(orderDto);
    }
}
