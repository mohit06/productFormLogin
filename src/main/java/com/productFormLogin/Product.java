package com.productFormLogin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int prod_id;
	private String prod_name;
	
	private String coupon;
	private int discount;
	
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	
	public Product(int prod_id, String prod_name, String coupon, int discount) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.coupon = coupon;
		this.discount = discount;
	}
	public Product() {
		super();
	}
	
	
	
	
	
}
