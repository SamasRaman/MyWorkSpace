package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Screen {
	@Value("${screen.glassType}")
	private String glassType;
	@Value("${screen.len}")
	private int len;
	@Value("${screen.bre}")
	private int bre;
	public Screen() {
		System.out.println("Creating Screen"+this);
	}
	public String getGlassType() {
		return glassType;
	}
	public void setGlassType(String glassType) {
		this.glassType = glassType;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}

	
	
}
