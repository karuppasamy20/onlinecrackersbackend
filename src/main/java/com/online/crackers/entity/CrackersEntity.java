package com.online.crackers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "crackersdetails")
public class CrackersEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "product_name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "actualprice")
	private Integer actualprice;
	@Column(name = "offerprice")
	private Integer offerprice;
	@Column(name = "price")
	private Integer price;
	@Column(name = "image_id")
	private Integer image_id;
	@Column(name = "totalprice")
	private Integer totalprice;

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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getActualprice() {
		return actualprice;
	}
	public void setActualprice(Integer actualprice) {
		this.actualprice = actualprice;
	}
	public Integer getOfferprice() {
		return offerprice;
	}
	public void setOfferprice(Integer offerprice) {
		this.offerprice = offerprice;
	}
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}
	public Integer getImage_id() {
		return image_id;
	}
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}

}
