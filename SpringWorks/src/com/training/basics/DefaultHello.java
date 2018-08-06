package com.training.basics;

public class DefaultHello implements HelloService{

	
	private String name;
	private String city;
	
	
	
	public DefaultHello() {
		super();
	}

	public DefaultHello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	@Override
	public String sayHello() {
		
		return sayHello(name,city);
	}

	//the values are given by configuration files
	@Override
	public String sayHello(String name, String city) {
		String myStrs[]= {"hey how are u mr/ms %s & how is ur city %s","Good Morning %s, are you in %s",
				"Mr/Ms %s, your city is beautiful %s"
	};
		int randomNumber=(int) (Math.random() *3);
		return String.format(myStrs[randomNumber], name,city);

}
	
	public void ginit() {
		System.out.println("Global init in Default Hello");
	}
	
	public void gdestroy() {
		System.out.println("Global destroy in Default Hello");
	}
}
