package com.xworkz.festival.festivals.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries(value = { 
		@NamedQuery(name = "getAllDetails", query =" from FestivalDTO dto ") })
@Table(name = "festival_table")
public class FestivalDTO implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="festival_name")
	private String name;
	@Column(name="festival_month")
	private String month;
	@Column(name="festival_days")
	private String days;
	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", month=" + month + ", days=" + days + "]";
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
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	
	
	

}
