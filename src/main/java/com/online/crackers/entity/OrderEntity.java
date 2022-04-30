package com.online.crackers.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "orderdetails")
public class OrderEntity {
	
	@Id
	@GenericGenerator(name = "orderid", strategy = "com.online.crackers.generator.ClientIdGenerator")
    @GeneratedValue(generator = "orderid")  
	@Column(columnDefinition = "varchar(255)")
	private String orderid;
	@Column(name = "name")
	private String name;
	@Column(name = "mobilenumber")
	private Long mobilenumber;
	@ElementCollection
	private List<OrderItem>  orderdetails;
	@Column(name = "emailid")
	private String emailid;
	@Column(name = "address")
	private String address;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<OrderItem>  getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<OrderItem>  orderdetails) {
		this.orderdetails = orderdetails;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String string) {
		this.orderid = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
}
