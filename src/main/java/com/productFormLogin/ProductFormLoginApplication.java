package com.productFormLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class ProductFormLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductFormLoginApplication.class, args);
	}

}
