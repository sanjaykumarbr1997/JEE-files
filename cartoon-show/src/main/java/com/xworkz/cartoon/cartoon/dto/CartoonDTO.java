package com.xworkz.cartoon.cartoon.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartoon_show")
public class CartoonDTO {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	@Column(name = "cartoon_name")
	private String name;
	@Column(name="cartoon_ratings")
	private String ratings;
	@Column(name="cartoon_release_year")
	private String release_year;
	@Override
	public String toString() {
		return "CartoonDTO [id=" + id + ", name=" + name + ", ratings=" + ratings + ", release_year=" + release_year
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
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	
	
}