package com.exilant.training.kafka;

import java.util.Arrays;

import lombok.Data;

@Data
public class User {
	
	private int id;
	private String name;
	private String[] address;
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + Arrays.toString(address) + "]";
	}
	public User() {
		super();
	}
	public User(int id, String name, String[] address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}

	
	
}
