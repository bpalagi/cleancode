package com.example.orders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.orders.model.Order;

@SpringBootTest
@AutoConfigureMockMvc
public class OrdersControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getHello() throws Exception {

		String expectedOrder = """
				{
					id: 1234,
					itemId: 5678,
					customerId: 9012,
					date: "2021-09-01",
					total: 100,
					shippingAddress: "123 Main St",
					status: "Shipped"
				}
				""";

		mvc.perform(MockMvcRequestBuilders.get("/1234").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(expectedOrder));
	}
}