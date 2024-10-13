package com.example.orders.controllers;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orders.model.Order;
import com.example.orders.service.OrdersService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@Validated
public class OrdersController {
	private final OrdersService ordersService;

	@GetMapping("/")
	public List<Order> getAllOrders() {
		return ordersService.findAllOrders();
	}
	
	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable Integer id) {
		return ordersService.findOrderById(id);
	}
}