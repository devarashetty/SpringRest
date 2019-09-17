package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class CustomerEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerid;
	private String customer_name;
	private String customerstatus;
	private String customercrmid;
	public CustomerEntity() {
		super();
	};
	
	public String toString() {
		return this.customer_name.toString() + this.customerstatus.toString();
	}
	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomerstatus() {
		return customerstatus;
	}
	public void setCustomerstatus(String customerstatus) {
		this.customerstatus = customerstatus;
	}
	public String getCustomercrmid() {
		return customercrmid;
	}
	public void setCustomercrmid(String customercrmid) {
		this.customercrmid = customercrmid;
	}
}
