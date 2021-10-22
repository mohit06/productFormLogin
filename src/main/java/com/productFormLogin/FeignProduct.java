package com.productFormLogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name="couponFormLogin", url="localhost:8000")  
public interface FeignProduct {


	
	@GetMapping("/getCouponDetails/{couponCode}")
	public CouponDetails getCouponDetails(@PathVariable String couponCode);
	
	@PostMapping("/createNewProduct")
	public CouponDetails getCouponDetail(@RequestParam(name="coupon") String coupon);
	
	
	
}
