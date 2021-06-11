package com.xworkz.regapp.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RegisterDTO implements Serializable {
	
	private int registerid;
	private String name;
	private String email;
	private String age;
	
	public RegisterDTO() {
		System.out.println(this.getClass().getSimpleName() + "object is created");
		
	}

	public int getRegisterid() {
		return registerid;
	}

	public void setRegisterid(int registerid) {
		this.registerid = registerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}





}
