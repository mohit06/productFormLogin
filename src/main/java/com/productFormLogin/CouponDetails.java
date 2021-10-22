package com.productFormLogin;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CouponDetails {
	
	private String CouponCode;
	private int discount;
	public String getCouponCode() {
		return CouponCode;
	}
	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public CouponDetails(String couponCode, int discount) {
		super();
		CouponCode = couponCode;
		this.discount = discount;
	}
	public CouponDetails() {
		super();
	}
	
	

}
