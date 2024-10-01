package com.example.orders.controllers;

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
public class OrdersController {

	private final OrdersService ordersService;

	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return ordersService.findById(id);
	}

}