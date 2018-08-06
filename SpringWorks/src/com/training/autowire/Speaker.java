package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Speaker {
	@Value("${speaker.type}")
	private String type;
	@Value("${speaker.volLevels}")
	private int volLevels;
	public Speaker() {
		System.out.println("Creating Speker"+this);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVolLevels() {
		return volLevels;
	}
	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	
	

}
