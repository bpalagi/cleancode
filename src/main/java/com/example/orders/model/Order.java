package com.example.orders.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order{

  @Id
  private Integer id;
  private Long itemId;
  private Long customerId;
  private LocalDateTime orderDate;
  private Long total;
  private String shippingAddress;
  private String shippingStatus;

}
