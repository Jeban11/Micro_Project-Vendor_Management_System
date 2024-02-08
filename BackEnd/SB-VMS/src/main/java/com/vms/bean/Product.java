package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="tbl_product")
public class Product {
	@Id
	@Column(name="Id")
	private Long id;
	@Column(name="Contract_Number")
	private Long cno;
	@Column(name="Product_name")
	private String pname;
	@Column(name="Product_Price")
	private String price;
	@Column (name="Product_Brand")
	private String brand;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long id, Long cno, String pname, String price, String brand) {
		super();
		this.id = id;
		this.cno = cno;
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCno() {
		return cno;
	}
	public void setCno(Long cno) {
		this.cno = cno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}