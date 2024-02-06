package com.vms.bean;

import java.util.*;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tbl_Vendor")
public class Vendor {
	@Id
	@Column(name = "Vendor_Id")
	private Long id;
	@Column(name = "Vendor_Name")
	private String name;
	@Column(name = "Country_Region")
	private String country;
	@Column(name = "Company_Registration_Number")
	private String company;
	@Column(name = "Stock_Symbol")
	private String ssymbol;
	@Column(name = "Relationship_Since")
	private String relationship;
	@Column(name = "Email")
	private String email;
	@Column(name = "Mobile_Number")
	private String mobile;

	
	

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(Long id, String name, String country, String company, String ssymbol, String relationship,
			String email, String mobile, List<Contract> contract) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.company = company;
		this.ssymbol = ssymbol;
		this.relationship = relationship;
		this.email = email;
		this.mobile = mobile;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSsymbol() {
		return ssymbol;
	}

	public void setSsymbol(String ssymbol) {
		this.ssymbol = ssymbol;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	

}
