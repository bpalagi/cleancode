package com.example.orders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.orders.model.Order;
import com.example.orders.repository.OrdersRepository;
import java.time.LocalDateTime;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrdersApplication {

	private static final Logger log = LoggerFactory.getLogger(OrdersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(OrdersRepository ordersRepository) {
		return args -> {
			Order savedOrder = new Order(1, 1, 1, LocalDateTime.now(), 1.0, "Addy", "Shipped");

			ordersRepository.save(savedOrder);
			log.info("Order saved: " + savedOrder);
		};
	}
}