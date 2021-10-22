package com.productFormLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private FeignProduct prod;
	
	@Autowired
	private ProdRepo repo;
	public void createProduct(int id, String name, String coupon) {
		
		CouponDetails cd = prod.getCouponDetails(coupon);
		if (cd==null) {
			System.out.println("Product cant be created.");
			return;
		}
		Product p = new Product(id,name,cd.getCouponCode(),cd.getDiscount());
		repo.save(p);
		System.out.println("Product created successfully!!");
		return;
	}

}
