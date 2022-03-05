package com.example.onlineshopping.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name = "PRODUCTS")
public class Products {

	@Id 
	private int id;  
	
	@Column(name = "PREODUCT_CODE")
	private String productCode;  
	
	@Column(name = "PREODUCT_NAME")  
	private String productName;  
	
	@Column(name = "PREODUCT_DESC")  
	private String productDesc;
	
	@Column(name = "PRICE")  
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} 
	
}
