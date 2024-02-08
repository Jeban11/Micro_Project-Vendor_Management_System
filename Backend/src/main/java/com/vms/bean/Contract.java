package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tbl_Contract")
public class Contract {
	
	@Column(name="Vendor_Id")
	private long id;
	
	@Column(name="Vendor")
	private String name;
	
	@Id
	@Column(name="Contract_Number")
	private long cno;
	
	@Column(name="Catogory")
	private String catogory;
	
	@Column(name="Products")
	private String products;
	
	@Column(name="Product_Status")
	private String status;
	
	@Column(name="Des")
	private String description;
	
	
	public Contract() {
		super();
		
	}
	public Contract(long id, String name, long cno, String catogory, String products, String status,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.cno = cno;
		this.catogory = catogory;
		this.products = products;
		this.status = status;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public String getCatogory() {
		return catogory;
	}
	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescribtion(String description) {
		this.description = description;
	}
	

	
}
