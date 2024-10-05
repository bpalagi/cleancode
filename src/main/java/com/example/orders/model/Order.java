package com.example.orders.model;

import lombok.Builder;

@Builder
public record Order(
  Long id,
  Long itemId,
  Long customerId,
  String date,
  Long total,
  String shippingAddress,
  String status) {
}
