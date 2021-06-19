package com.xworkz.netflix_app.netflix.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="netflix_table")
public class NetflixDTO implements Serializable {
	@Id
	@Column(name="netflix_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column(name="netflix_name")
	private String name;
	@Column(name="netflix_type")
	private String type;
	@Column(name="netflix_ratings")
	private String ratings;
	@Column(name="netflix_releaseYear")
	private String releaseYear;
	@Override
	public String toString() {
		return "NetflixDTO [id=" + id + ", name=" + name + ", type=" + type + ", ratings=" + ratings + ", releaseYear="
				+ releaseYear + "]";
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	
	

}
