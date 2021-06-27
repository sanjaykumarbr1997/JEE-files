package com.xworkz.self_driving.selfdriving.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="selfdriving_customer")
public class SelfDrivingDTO implements Serializable{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="customer_name")
	private String name;
	@Column(name="customer_location")
	private String location;
	@Column(name="cusotmer_mobile")
	private String mobileNo;
	@Override
	public String toString() {
		return "SelfDrivingDTO [id=" + id + ", name=" + name + ", location=" + location + ", mobileNo=" + mobileNo
				+ "]";
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}


