package com.example.orders;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrdersControllerIntegrationTest {

	@Autowired
	private TestRestTemplate template;

    @Test
    public void getHello() throws Exception {
        String expectedOrder = "{\"id\":1234,\"itemId\":null,\"customerId\":1122,\"date\":null,\"total\":null,\"shippingAddress\":null,\"status\":null}";

        ResponseEntity<String> response = template.getForEntity("/orders/1234", String.class);
        assertThat(response.getBody()).isEqualTo(expectedOrder);
    }
}