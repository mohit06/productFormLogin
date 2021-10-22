package com.productFormLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	ProdRepo repo;
	
	@Autowired
	SecurityServiceImpl ssi;
	
	@Autowired
	FeignProduct fc;
	
	@GetMapping("/index")
	public String createProduct() {
		return "index";
	}
	
	@GetMapping("/")
	public String login() {
	
			return "login";
		
		
	}
	
	@PostMapping("/login2")
	public String login2(@RequestParam(name="email")String email, @RequestParam(name="password")String password) {
		boolean rs = ssi.login(email, password);
		if(rs) {
			return "index";
		}
		else {
			return "login";
		}
		
	}
	
	@PostMapping("/createNewProduct")
	public ModelAndView createNewProduct(int prod_id, String prod_name,String coupon,int discount) {
        
		ModelAndView mav = new ModelAndView("prodResponse");
		mav.addObject("ID", prod_id);
		mav.addObject("PROD_NAME", prod_name);
		mav.addObject("COUPON", coupon);
		CouponDetails cc =fc.getCouponDetail(coupon);
		mav.addObject("DISCOUNT", cc.getDiscount());
		repo.save(new Product(prod_id,prod_name,coupon,discount));
		return mav;
	}
	
}

