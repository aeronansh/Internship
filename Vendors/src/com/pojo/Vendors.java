package com.pojo;

import java.sql.Date;

public class Vendors {
	
	private int id;
	private String name,email,city;
	private long phn;
	
	private Date reg;
	
	public Vendors(int id, String name, String email, String city, long phn, Date reg) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.phn = phn;
		this.reg = reg;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	public Date getReg() {
		return reg;
	}
	public void setReg(Date reg) {
		this.reg = reg;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Vendors [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", phn=" + phn
				+ ", reg=" + reg + "]";
	}
	
	
	
}
