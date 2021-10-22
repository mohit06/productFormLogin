package com.productFormLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping("/createProduct/{id}/{name}/{coupon}")
	public String createProduct(@PathVariable int id, @PathVariable String name, @PathVariable String coupon) {
		ps.createProduct(id,name,coupon);
		return "";
	}

}
