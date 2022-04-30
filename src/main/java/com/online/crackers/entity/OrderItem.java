package com.online.crackers.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderItem {

	@Column(name = "id")
	private Integer id;

	@Column(name = "product_name")
	private String name;

	@Column(name = "price")
	private Integer price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
