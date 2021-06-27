package com.xworkz.whiskyApp.whisky.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whisky_order")
public class WhiskyDTO implements Serializable{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="whisky_name")
	private String name;
	@Column(name="whisky_quantity")
	private String quantity;
	@Column(name= "whisky_ordered_numbers")
	private String orderdNo;
	@Column(name= "whisky_price")
	private String price;
	@Override
	public String toString() {
		return "WhiskyDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + ", orderdNo=" + orderdNo
				+ ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getOrderdNo() {
		return orderdNo;
	}
	public void setOrderdNo(String orderdNo) {
		this.orderdNo = orderdNo;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	

}
